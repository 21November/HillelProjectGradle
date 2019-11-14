package lesson2;

public class Student {

    public int id;
    public static int nextId = 1;
    public String name;
    public int age;

    public Student(int id, String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
