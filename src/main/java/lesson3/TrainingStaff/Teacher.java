package lesson3.TrainingStaff;

public class Teacher {
    private String firstName;
    private String lastName;
    private String thing;
    private int age;
    private long id;
    public static int nextId = 100;


    public Teacher(String firstName, String lastName, String thing, int age, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thing = thing;
        this.age = age;
        this.id = nextId++;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getThing() {
        return thing;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }
}
