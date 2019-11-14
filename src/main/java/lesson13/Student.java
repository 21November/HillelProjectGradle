package lesson13;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String numberPhone;
    private Integer yearOfBirth;

    public Student(String firstName, String lastName, String numberPhone, Integer yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                numberPhone.equals(student.numberPhone) &&
                yearOfBirth.equals(student.yearOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, numberPhone, yearOfBirth);
    }
}
