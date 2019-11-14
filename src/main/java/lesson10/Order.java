package lesson10;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    //Заказ
    private String nameOrder;
    private Customer customer;
    private List<Product> listProduct;
    private Date dateOfCreation;
    private ShippingDetails shippingDetails;
    private OrderStatus orderStatus;
    private long id;
    public static int nextId = 101;

    public Order(String nameOrder, Customer customer, List<Product> listProduct, Date dateOfCreation, ShippingDetails shippingDetails, OrderStatus orderStatus, long id) {
        this.nameOrder = nameOrder;
        this.customer = customer;
        this.listProduct = listProduct;
        this.dateOfCreation = dateOfCreation;
        this.shippingDetails = shippingDetails;
        this.orderStatus = orderStatus;
        this.id = nextId++;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                nameOrder.equals(order.nameOrder) &&
                customer.equals(order.customer) &&
                listProduct.equals(order.listProduct) &&
                dateOfCreation.equals(order.dateOfCreation) &&
                shippingDetails.equals(order.shippingDetails) &&
                orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOrder, customer, listProduct, dateOfCreation, shippingDetails, orderStatus, id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameOrder='" + nameOrder + '\'' +
                ", customer=" + customer +
                ", listProduct=" + listProduct +
                ", dateOfCreation=" + dateOfCreation +
                ", shippingDetails=" + shippingDetails +
                ", orderStatus=" + orderStatus +
                ", id=" + id +
                '}';
    }
}
