package lesson10;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Functional {
//9 задание
    public Map<Customer, Triplet<Integer, BigDecimal, BigDecimal>> sortingCustomersByOrders (List<Order> listOrders){
        checkNull(listOrders);

        Map<Customer, Triplet<Integer, BigDecimal, BigDecimal>> map = new HashMap<Customer, Triplet<Integer, BigDecimal, BigDecimal>>();

        for (Order order : listOrders){

            BigDecimal sumCostProduct = new BigDecimal("0");
            for (Product product : order.getListProduct()){
                sumCostProduct = sumCostProduct.add(product.getCost());
            }

//            BigDecimal sumCostShipping = new BigDecimal(String.valueOf(
//                    order.getShippingDetails().getCost().multiply(new BigDecimal(order.getListProduct().size()))));
            //На случай если сумма доставки зависит от количества заказаного товара.
            // То есть умножается на количество заказаного товара

            Triplet<Integer, BigDecimal, BigDecimal> triplet = new Triplet<>(order.getListProduct().size(),
                    sumCostProduct, order.getShippingDetails().getCost());

            map.put(order.getCustomer(), triplet);
        }
        return map;
    }


//10 задание
    public Map<String, String> ordersWithDeliveryExpectedStatus (List<Order> listOrders){
        checkNull(listOrders);

        Map<String, String> map = new HashMap<String, String>();

        for (Order order : listOrders){
            if (order.getOrderStatus() == OrderStatus.Delivery_expected){
                map.put(order.getNameOrder(), order.getShippingDetails().getAddress());
            }
        }
        return map;
    }


//11 задание
    public Map<Product, Integer> sortingProductsByTheNumberOfOrders (List<Order> listOrder){

        Map<Product, Integer> map = new HashMap<Product, Integer>();
        Integer quantity = 0;
        for (Order order : listOrder){
            for (Product product : order.getListProduct()){

            }
        }

        return null;
    }

    private void checkNull (List<Order> orders){
        if (orders.size() == 0){
            System.out.println("Order list is empty!");
        }
    }
}
