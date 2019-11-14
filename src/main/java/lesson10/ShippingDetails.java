package lesson10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class ShippingDetails {
    //детали доставки

    private BigDecimal cost;
    private String address;

    public ShippingDetails(BigDecimal cost, String address) {
        this.cost = cost;
        this.address = address;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingDetails that = (ShippingDetails) o;
        return cost.equals(that.cost) &&
                address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, address);
    }
}
