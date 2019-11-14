package lesson12;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws IllegalAccessException{
        if (name == null || name.length() == 0) {
            throw new IllegalAccessException("Поле имени не может быть пустым");
        }
        this.name = name;
    }

    public void setAge(int age) throws IllegalAccessException{
        if (age <= 0) {
            throw new IllegalAccessException("Возраст не может быть равен нулю");
        }
        this.age = age;
    }

    public static Student deserialize(String string) throws MyDomainException{
        throw new MyDomainException();
//        try {
//            return new Student(string, string.length());
//        }catch (Exception e){
//            System.out.println("Ошибка: " + e.getMessage());
//            throw new  MyDomainException("Детально описание ошибки", e);
//        }

    }
}
