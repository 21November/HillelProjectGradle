package lesson22;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class CalculaterFibonacciCallable implements Callable<BigInteger> {
    private int number1;
    private int number2;
    private BigInteger penultimateValue;
    private BigInteger lastValue;

    public CalculaterFibonacciCallable(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public BigInteger call() throws Exception {
        BigInteger a = BigInteger.valueOf(number1);
        BigInteger b = BigInteger.valueOf(number2);
        for (int i = 2; i <= 888888888; ++i) {
            if (!Thread.currentThread().isInterrupted()) {
                BigInteger next = a.add(b);
                a = b;
                penultimateValue = a;
                b = next;
                lastValue = b;
            }else {
                break;
            }

        }
        return getLastValue();
    }

    public BigInteger getPenultimateValue() {
        return penultimateValue;
    }

    public BigInteger getLastValue() {
        return lastValue;
    }
}
