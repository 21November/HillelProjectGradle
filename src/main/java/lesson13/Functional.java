package lesson13;

import java.util.Comparator;
import java.util.List;

public class Functional {

    public void averageValue (List<Integer> arrays){
        if (arrays == null){
            System.out.println("массив пуст");
        }

        int count = 0;
        int sum = 0;

        for (Integer integer : arrays){
            if (integer > 0){
                count ++;
                sum += integer;
            }
        }
        try {
            System.out.println("Среднее значение положительных чисел = " + sum/count);
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
    }

    public void sortingContactYearOfBirth (List<Student> students){
        students.sort(comparator);
    }

    public void printerTopFiveStudentYearOfBirth (List<Student> students){
        if (students.size() == 0){
            System.out.println("Список контактов пуст");
        }

        if (students.size() >= 5){
            List<Student> fiveStudent = students.subList(0, 5);
            for (Student student : fiveStudent){
                System.out.printf(student.getFirstName() + '/' +
                        student.getLastName() + '/' +
                        student.getNumberPhone() + '/' +
                        student.getYearOfBirth() + '\n');
            }
        } else {
            for (Student student : students){
                System.out.printf(student.getFirstName() + '/' +
                        student.getLastName() + '/' +
                        student.getNumberPhone() + '/' +
                        student.getYearOfBirth() + '\n');
            }
        }
        //list.size() >= 5 ? (List<Pair<Contact, Integer>>) list.subList(0, 5) : list
        System.out.println();
    }

    private static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student student, Student student1) {
            return student.getYearOfBirth().compareTo(student1.getYearOfBirth());
        }
    };


}
