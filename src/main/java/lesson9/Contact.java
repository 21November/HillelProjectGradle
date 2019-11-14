package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 04.10.2019.
 */
public class Contact {
    private String name;
    private String forNumber;

    public Contact(String name, String forNumber) {
        this.name = name;
        this.forNumber = forNumber;
    }

    public String getName() {
        return name;
    }

    public String getForNumber() {
        return forNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!name.equals(contact.name)) return false;
        return forNumber.equals(contact.forNumber);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + forNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", forNumbar='" + forNumber + '\'' +
                '}';
    }

}
