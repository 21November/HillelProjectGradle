package lesson14;

import java.util.Random;

public class Factory {

    public User userCreate() {

        String[] firstNames = {"Bob", "Jec", "Tom", "Adam", "Victory", "Maikol", "Geil"};
        String firstName = firstNames[new Random().nextInt(firstNames.length)];

        String[] lastNames = {"Smitt", "Watson", "Holms", "Direct", "Krions", "Svarc", "Pipetti", "Van", "Chan"};
        String lastName = lastNames[new Random().nextInt(lastNames.length)];

        String[] numberPhones = {"101", "102", "103", "104", "105", "106", "107", "108", "109", "100"};
        String numberPhone = numberPhones[new Random().nextInt(numberPhones.length)];

        return new User(firstName, lastName, numberPhone);
    }

    public Contact contactCreate() {
        String[] firstNames = {"Bob", "Jec", "Tom", "Adam", "Victory", "Maikol", "Geil"};
        String firstName = firstNames[new Random().nextInt(firstNames.length)];

        String[] lastNames = {"Smitt", "Watson", "Holms", "Direct", "Krions", "Svarc", "Pipetti", "Van", "Chan"};
        String lastName = lastNames[new Random().nextInt(lastNames.length)];

        String[] numberPhones = {"101", "102", "103", "104", "105", "106", "107", "108", "109", "100"};
        String numberPhone = numberPhones[new Random().nextInt(numberPhones.length)];

        return new Contact(firstName, lastName, numberPhone);
    }
}
