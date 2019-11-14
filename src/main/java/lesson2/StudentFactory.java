package lesson2;

import java.util.Random;

public class StudentFactory {


    public Student studentCreate (){

        double age1 = 16 +  Math.random() * 10;
        int age = (int) age1;
        String[] names = {"Julia", "Adidas", "Julia", "Julia", "Halk", "Adam", "Sherlok", "Victory", "Maikol", "Advego"};
        String name = names[new Random().nextInt(names.length)];
        int id = 0;

        Student student = new Student(id, name, age);
        return student;
    }
}
