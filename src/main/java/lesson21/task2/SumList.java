package lesson21.task2;

import java.util.Collection;

public class SumList implements Runnable{
    Collection<Integer> collection;

    public SumList(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        int sum = collection.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum = " + sum);
    }
}
