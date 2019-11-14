package lesson3.TrainingStaff;

import java.util.Random;

public class TeacherFactory {

    public Teacher teacherCreate (){

        double age1 = 25 +  Math.random() * 30;
        int age = (int) age1;
        String[] firstNames = {"Iosif", "Ivan", "Albert", "Jonatan", "Klark", "Afanasii", "Lector"};
        String firstName = firstNames[new Random().nextInt(firstNames.length)];
        String[] lastNames = {"Spaider", "Lectorov", "Stalin", "Junior", "Einstein", "Fomin"};
        String lastName = lastNames[new Random().nextInt(lastNames.length)];
        String[] things = {"Chemistry", "Maths", "Physics", "History", "Programming", "English", "Psychology"};
        String thing = things[new Random().nextInt(things.length)];

        long id = 0;

        Teacher teacher = new Teacher(firstName, lastName, thing, age, id);
        return teacher;
    }
}
