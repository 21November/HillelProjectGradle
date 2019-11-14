package lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class MainInput {

    public static void main(String[] args) {

        Functional functional = new Functional();


        System.out.println("Чтение 100 первых чисел из файла и нахождение среднего значения положительных чисел");
        try (Scanner scanner = new Scanner( new FileInputStream("random.txt"))){
            List<Integer> list = new ArrayList<Integer>();
            scanner.useDelimiter(",");

            for (int i = 0; i < 100; i++) {
                if (scanner.hasNextInt()){
                    list.add(scanner.nextInt());
                }else {
                    break;
                }
            }
            System.out.println(list);
            functional.averageValue(list);
        }catch (
                IOException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Чтениее списка контактов, сортировка по году рождения (в порядке возрастания) и вывод на экран первых 5");
        List<Student> contactList = new ArrayList<Student>();

        try{
            FileInputStream fstream = new FileInputStream("contactStudents.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null)   {
                String[] tokens = strLine.split("/");
                Student student = new Student( tokens[0],tokens[1],tokens[2], Integer.parseInt(tokens[3]));//process record , etc
                contactList.add(student);
            }
            in.close();

            functional.sortingContactYearOfBirth(contactList);
            functional.printerTopFiveStudentYearOfBirth(contactList);
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}
