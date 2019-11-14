package lesson14;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String numberPhone;
    public int[] marks;
    public transient long ignoredField;

    public Contact(String firstName, String lastName, String numberPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        Contact contact = (Contact) o;
        return ignoredField == contact.ignoredField &&
                firstName.equals(contact.firstName) &&
                lastName.equals(contact.lastName) &&
                numberPhone.equals(contact.numberPhone) &&
                Arrays.equals(marks, contact.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, numberPhone, ignoredField);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
