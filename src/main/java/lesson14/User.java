package lesson14;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String numberPhone;

    public User(String firstName, String lastName, String numberPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                numberPhone.equals(user.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, numberPhone);
    }
}
