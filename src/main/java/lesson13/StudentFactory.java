package lesson13;

import java.util.Random;

public class StudentFactory {

    public Student studentCreate (){
        String[] firstNames = {"Bob", "Jec", "Tom", "Julia", "Halk", "Adam", "Sherlok", "Victory", "Maikol", "Geil"};
        String firstName = firstNames[new Random().nextInt(firstNames.length)];

        String[] lastNames = {"Smitt", "Watson", "Holms", "Haus", "Direct", "Krions", "Svarc", "Pipetti", "Van", "Chan"};
        String lastName = lastNames[new Random().nextInt(lastNames.length)];

        String[] numberPhones = {"101", "102", "103", "104", "105", "106", "107", "108", "109", "100"};
        String numberPhone = numberPhones[new Random().nextInt(numberPhones.length)];

        int[] yearOfBirths = {1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999};
        int yearOfBirth = yearOfBirths[new Random().nextInt(yearOfBirths.length)];

        return new Student(firstName, lastName, numberPhone, yearOfBirth);
    }
}
