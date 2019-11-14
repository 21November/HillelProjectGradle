package lesson7.practice2;

import java.util.Comparator;

public class ComparisonStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 20);
        Student student2 = new Student("Tom", 21);
        Student student3 = new Student("Ted", 25);
        Student student4 = new Student("Djon", 20);
        Student student5 = new Student("Derek", 19);

        System.out.println(Student.compareByName().compare(student1, student2));
        System.out.println(Student.compareByAge().compare(student1, student3));
        System.out.println(Student.compareByName().compare(student2, student4));
        System.out.println(Student.compareByNameByAge().compare(student1, student2));

    }



}
