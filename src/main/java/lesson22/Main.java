package lesson22;

import java.math.BigInteger;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        CalculateFactorialCallable fact = new CalculateFactorialCallable(100000000);
        CalculaterFibonacciCallable fibonacciCallable = new CalculaterFibonacciCallable(1,1);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        final Future<BigInteger> result = executor.submit(fibonacciCallable);
        try {
            BigInteger factorial = result.get(1, TimeUnit.SECONDS);
            System.out.println("Factorial: " + factorial);
        } catch (InterruptedException e) {
            System.out.println("Current thread was interrupted/cancelled");
            result.cancel(true);

            System.out.println("Factorial has been cancelled");
        } catch (ExecutionException e) {
            System.err.println("Internal factorial exception: " + e.getMessage());
        } catch (TimeoutException e) {
            result.cancel(true);
            System.out.println("Factorial has timed out and cancelled");
        }

        executor.shutdown();
        System.out.println("PenultimateValue: " + fibonacciCallable.getPenultimateValue());
        System.out.println("LastValue: " + fibonacciCallable.getLastValue());
    }

}
