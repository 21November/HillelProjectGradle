package lesson10;

import lesson10.factory.Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        List<Order> orders = new ArrayList<Order>();
        for (int i = 0; i < 10; i++){
            orders.add(factory.orderCreate());
        }

        Functional functional = new Functional();
        System.out.println(Arrays.toString(new List[]{orders}));

        System.out.println("Customer, number of products, total of all orders and delivery amount");
        functional.sortingCustomersByOrders(orders).forEach((key, value) -> System.out.println(key + " : "
                + value.getFirst() + ", " + value.getSecond() + ", " + value.getThird()));
        System.out.println();
        System.out.println("Orders awaiting delivery");
        functional.ordersWithDeliveryExpectedStatus(orders).forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }
}
