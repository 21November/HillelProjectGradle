package lesson4.Task1;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[6];

        people[0] = new Person("Mister", "Smitt", 35);
        people[1] = new Person("Missis", "Smitt", 33);
        people[2] = new Person("Mister", "Smitt", 35);
        people[3] = new Person("Missis", "Smitta", 33);
        people[4] = new Person("Mister", "Smitt", 45);
        people[5] = new Person("Missis", "Smitt", 35);

        System.out.println(people[0].equals(people[2]));
        System.out.println(people[0].equals(people[1]));
        System.out.println(people[0].equals(people[3]));
        System.out.println();

        System.out.println(people[0].hashCode());
        System.out.println(people[0].hashCode() == people[2].hashCode());
        System.out.println(people[2].hashCode());
        System.out.println(people[0].hashCode() == people[1].hashCode());
        System.out.println(people[1].hashCode());
        System.out.println(people[0].hashCode() == people[3].hashCode());
        System.out.println(people[3].hashCode());
        System.out.println();

        System.out.println(people[0].toString());

    }
}
