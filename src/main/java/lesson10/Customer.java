package lesson10;

import java.util.Objects;

public class Customer {

    private String nameCustomer;
    private long id;
    public static int nextId = 1001;

    public Customer(String nameCustomer, long id) {
        this.nameCustomer = nameCustomer;
        this.id = nextId++;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                nameCustomer.equals(customer.nameCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCustomer, id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", id=" + id +
                '}';
    }
}
