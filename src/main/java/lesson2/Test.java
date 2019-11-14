package lesson2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        Student[] students = new Student[5];
        StudentFactory studentFactory = new StudentFactory();
        StudentFunctions studentFunctions = new StudentFunctions();

        students[0] = studentFactory.studentCreate();
        students[1] = studentFactory.studentCreate();
        students[2] = studentFactory.studentCreate();
        students[3] = studentFactory.studentCreate();
        students[4] = studentFactory.studentCreate();


        System.out.println(Arrays.toString(students));
        System.out.println();


        studentFunctions.bubbleSorterAge(students);
        System.out.println(Arrays.toString(students));
        System.out.println();

        studentFunctions.bubbleSorterName(students);
        System.out.println(Arrays.toString(students));
        System.out.println();

        System.out.println(studentFunctions.getUserByName("Jul", students));
        //System.out.println(studentFunctions.getUserByName("Jec", students));
        //System.out.println(studentFunctions.getUserByName("Tom", students));
        //System.out.println(studentFunctions.getUserByName("Julia", students));
        //System.out.println(studentFunctions.getUserByName("Halk", students));
        //System.out.println(studentFunctions.getUserByName("Adam", students));
        //System.out.println(studentFunctions.getUserByName("Sherlok", students));
        //System.out.println(studentFunctions.getUserByName("Victory", students));
        //System.out.println(studentFunctions.getUserByName("Maikol", students));
        //System.out.println(studentFunctions.getUserByName("Geil", students));
        //System.out.println(studentFunctions.getUserByName("Den", students));
        //System.out.println(studentFunctions.getUserByName(null,students));
        System.out.println();

        System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Jul", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Jec", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Tom", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Julia", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Halk", students)));
        System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("a", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Sherlok", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Victory", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Maikol", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Geil", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Den", students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr(null,students)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Den", null)));
        //System.out.println(Arrays.toString(studentFunctions.getUserByNameArr(null, null)));



        /*Student[] students1 = new Student[5];
        students1[0] = new Student(0, "Marti", 21);
        students1[1] = new Student(0, "Sherlok", 15);
        students1[2] = new Student(0, "Bob", 20);
        students1[3] = new Student(0, "Don", 25);
        students1[4] = new Student(0, "Marti", 13);
        System.out.println(Arrays.toString(students1));

        //studentFunctions.bubbleSorter(students1);
       // System.out.println(Arrays.toString(students1));

       studentFunctions.getUserByName("Maikol", students);
        studentFunctions.getUserByName("Bob", students);
        studentFunctions.getUserByName("Sherlok", students);
        studentFunctions.getUserByName("Julia", students);

        System.out.println(studentFunctions.getUserByName("Marti", students1));
        System.out.println(studentFunctions.getUserByName("Bob", students1));
        System.out.println(Arrays.toString(studentFunctions.getUserByNameArr("Marti", students1)));*/

    }
}