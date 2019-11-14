package lesson22;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class CalculateFactorialCallable implements Callable<BigInteger> {

    private int number;

    public CalculateFactorialCallable(int number) {
        this.number = number;
    }


    @Override
    public BigInteger call() throws Exception {


        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println("Factorial" + i);
            }else {
                break;
            }
        }
        return fact;



    }
}
