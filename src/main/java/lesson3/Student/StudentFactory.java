package lesson3.Student;

import java.util.Random;

public class StudentFactory {

    public Student studentCreate (){

        double age1 = 10 +  Math.random() * 10;
        int age = (int) age1;
        String[] names = {"Bob", "Jec", "Tom", "Julia", "Halk", "Adam", "Sherlok", "Victory", "Maikol", "Geil"};
        String name = names[new Random().nextInt(names.length)];
        long id = 0;

        Student student = new Student(name, age, id);
        return student;
    }
}
