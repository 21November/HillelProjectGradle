package lesson10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Product {

    private String nameProduct;
    private BigDecimal cost;
    private long id;
    public static int nextId = 1;

    public Product(String nameProduct, BigDecimal cost, long id) {
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.id = nextId++;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public long getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                nameProduct.equals(product.nameProduct) &&
                cost.equals(product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, cost, id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}