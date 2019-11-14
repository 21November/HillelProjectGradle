package lesson3.Student;

public class Student {
    private String name;
    private int age;
    private long id;
    public static int nextId = 1;

    public Student(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }


}
