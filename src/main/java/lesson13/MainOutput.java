package lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainOutput {

    public static void main(String[] args) {

        StudentFactory studentFactory = new StudentFactory();
        List<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 20; i++){
            students.add(studentFactory.studentCreate());
        }

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("contactStudents.txt"))){

            for (Student student : students){
                writer.printf(student.getFirstName() + '/'
                        + student.getLastName() + '/' +
                        student.getNumberPhone() + '/' +
                        student.getYearOfBirth());
                writer.println();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
