package lesson7.practice1.person;

import lesson7.practice1.factory.Factory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String gender;
    private LocalDate birthday;
    private Person spouse;
    private List<Person> children;
    private List<Person> grandChildren;

    private Person(LocalDate birthday, String gender, String name) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        children = new ArrayList<>();
        grandChildren = new ArrayList<>();
    }
    //Возвращает персону со случайно сгенерированными полями
    public static Person of() {
        LocalDate birthday = Factory.getDate();
        Factory.Gender gender = Factory.getGender();
        String name = Factory.getName(gender);
        return new Person(birthday, gender.toString(), name);
    }
    //Человек со случайными параметрами ожидает рождения
    public static Person of(LocalDate birthday) {
        Factory.Gender gender = Factory.getGender();
        String name = Factory.getName(gender);
        return new Person(birthday, gender.toString(), name);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setGender(String gender) {
        if (gender != null) {
            this.gender = gender;
        }
    }
    //Меняет
    public void setBirthday(LocalDate birthday) {
        if (birthday != null) {
            this.birthday = birthday;
        }
    }

    public void setSpouse(Person spouse) {
        if (spouse != null) {
            this.spouse = spouse;
        }
    }
    //Добавление в список детей еще одного ребенка
    public void addChildren(Person child) {
        if (child != null) {
            this.children.add(child);
        }
    }
    //Добавление в список внуков еще одного внука
    public void addGrandChild(Person grandChild) {
        if (grandChild != null) {
            this.grandChildren.add(grandChild);
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person getSpouse() {
        return spouse;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getGrandChildren() {
        return grandChildren;
    }
}
