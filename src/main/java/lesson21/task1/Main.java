package lesson21.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            list.add(i);

        }

        CollectionNumber collection = new CollectionNumber(list);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> result = executor.submit(collection);
        try {
            result.get();
            System.out.println("Task has completed");
        } catch (ExecutionException ignored) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shutdownAndAwaitTermination(executor);
    }


    static void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown();
        try {    if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
            pool.shutdownNow();      if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                System.err.println("Pool did not terminate");
            }
        }
        } catch (InterruptedException ie) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
