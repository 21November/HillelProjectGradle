package lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainInput {

    public static void main(String[] args) {

//        try (DataInputStream stream = new DataInputStream(new FileInputStream("data.bin"))){

//            int intValue1 = stream.readInt();
//            float floatValue = stream.readFloat();
//            String stringValue1 = stream.readUTF();
//            int intValue2 = stream.readInt();
//            boolean booleanValue = stream.readBoolean();
//            byte byteValue = stream.readByte();
//            byte byteValue2 = stream.readByte();
//            //String stringValue2 = stream.readUTF();
//            char charValue = stream.readChar();
//            char charValue2 = stream.readChar();
//            //String stringValue3 = stream.readUTF();
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (DataInputStream stream = new DataInputStream(new FileInputStream("Strings.bin"))){
            List<String> list = new ArrayList<String>();

            int intValue1 = stream.readInt();
            int intValue = stream.readInt();
            for (int i = 0; i < intValue; i++){
                String value = stream.readUTF();
                list.add(value);
            }
            int intValue2 = stream.readInt();

            System.out.println(list.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4 задание

        List<User> contactList = new ArrayList<User>();
        try (DataInputStream stream = new DataInputStream(new FileInputStream("ContactsUsers.bin"))){

            int count = stream.readInt();
            for (int i = 0; i < count; i++){
                contactList.add(new User(stream.readUTF(), stream.readUTF(), stream.readUTF()));
            }

            System.out.println(contactList.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Контакты");
        contactList.forEach(user -> System.out.println(user.getFirstName()
                + " " + user.getLastName()
                + " " + user.getNumberPhone()));


        //5 задание

        List<Contact> contactListSerial = new ArrayList<>();
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("ContactSerializable.txt"))){
            int count = oin.readInt();
            for (int i = 0; i < count; i++){
                contactListSerial.add((Contact) oin.readObject());
            }

        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Сериализация контактов");
        contactListSerial.forEach(contact -> System.out.println(contact.getFirstName()
                + " " + contact.getLastName()
                + " " + contact.getNumberPhone()));
    }
}
