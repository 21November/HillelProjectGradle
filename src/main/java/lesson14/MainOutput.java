package lesson14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainOutput {
    public static void main(String[] args) {
//        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("data.bin"))){
//            stream.writeInt(123);
//            stream.writeFloat(123.123f);
//            stream.writeUTF("hello и привет");
//            stream.write(321);
//            stream.writeBoolean(true);
//            stream.writeByte(3214);
//            stream.writeBytes("3214");
//            stream.writeChar(4561);
//            stream.writeChars("4561");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("Strings.bin"))){
            List<String> list = new ArrayList<String>();
            //list.add("01234567891");
            list.add("int");
            list.add("bot");
            list.add("cat");
            list.add("dog");
            list.add("20");
            list.add("четыре");
            list.add("50");
            list.add("10");
            list.add("hello");
            list.add("world");
            System.out.println(list.size());

            stream.writeInt(575757);
            stream.writeInt(list.size());
            for (String string : list){
                stream.writeUTF(string);
            }
            stream.writeInt(76544);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Factory userFactory = new Factory();
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("ContactsUsers.bin"))){
            List<User> list = new ArrayList<User>();
            for (int i = 0; i < 20; i++){
                list.add(userFactory.userCreate());
            }

            System.out.println(list.size());

            stream.writeInt(list.size());
            for (User user : list){
                stream.writeUTF(user.getFirstName());
                stream.writeUTF(user.getLastName());
                stream.writeUTF(user.getNumberPhone());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //5 задание
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ContactSerializable.txt"))) {
            List<Contact> contactList = new ArrayList<Contact>();
            for (int i = 0; i < 20; i++){
                contactList.add(userFactory.contactCreate());
            }

            out.write(contactList.size());
            for (Contact contact : contactList){
                out.writeObject(contact);
            }

        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }

        //6
        try (Stream<Path> pathFind =
                     Files.find(Paths.get("E:\\JAVA\\HillelProject"), 100, (path, attr) -> attr.isRegularFile())) {
            System.out.println("Found " + pathFind.count() + " files");
//            pathFind.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Cannot resolve the path");
            e.printStackTrace();
        }
    }

}
