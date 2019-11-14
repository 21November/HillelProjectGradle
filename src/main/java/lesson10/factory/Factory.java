package lesson10.factory;

import lesson10.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Factory {

    public Product productCreate () {
        String[] namesProduct = {"phone", "book","clock", "the flowers", "lamp", "table", "chair", "carpet"};
        String nameProduct = namesProduct[new Random().nextInt(namesProduct.length)];

        BigDecimal[] costs = {new BigDecimal("100.000"), new BigDecimal("120.000"), new BigDecimal("140.000"),
                new BigDecimal("160.000"), new BigDecimal("180.000"), new BigDecimal("200.000"),
                new BigDecimal("220.000"), new BigDecimal("240.000")};
        BigDecimal cost = costs[new Random().nextInt(costs.length)];

        return new Product(nameProduct, cost, 1);
    }

    public Customer customerCreate (){
        String[] names = {"Adidas", "Julia","Halk", "Adam", "Sherlok"};
        String nameCustomer = names[new Random().nextInt(names.length)];

        return new Customer(nameCustomer, 1001);
    }

    public ShippingDetails shippingDetailsCreate (){
        BigDecimal[] costs = {new BigDecimal("10.000"), new BigDecimal("12.000"), new BigDecimal("14.000"),
                new BigDecimal("16.000"), new BigDecimal("18.000"), new BigDecimal("20.000"),
                new BigDecimal("22.000"), new BigDecimal("24.000")};
        BigDecimal cost = costs[new Random().nextInt(costs.length)];

        String[] addresses = {"Pushkinskaya street 50", "Sumskaya street 101","Moscow avenue 320",
                "Akademika Pavlova Street 110", "street Guards Shironintsev 33", "Metrostroiteley street 55"};
        String address = addresses[new Random().nextInt(addresses.length)];

        return new ShippingDetails(cost, address);
    }

    public Order orderCreate(){
        String[] namesOrders = {"10001A", "10002A","10003A", "10004A", "10005A", "10006A", "10007A", "10008A"};
        String namesOrder = namesOrders[new Random().nextInt(namesOrders.length)];

        List<Product> listProducts = new ArrayList<Product>();
        for (int i = 0; i < 5; i++){
            listProducts.add(productCreate());
        }

        return new Order(namesOrder, customerCreate(), listProducts, new Date(),
                shippingDetailsCreate(), OrderStatus.randomStatus(), 101);
    }
}
