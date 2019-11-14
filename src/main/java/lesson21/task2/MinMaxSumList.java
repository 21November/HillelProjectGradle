package lesson21.task2;

import java.util.Collection;
import java.util.Collections;

public class MinMaxSumList implements Runnable {
    Collection<Integer> collection;

    public MinMaxSumList(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        System.out.println("Max = " + Collections.max(collection));
        System.out.println("Min = " + Collections.min(collection));

        System.out.println("Average = " + calculateAverage(collection));
        int sum = collection.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum = " + sum);


    }

    private int calculateAverage(Collection<Integer> marks) {
        int sum = 0;
        for (int i = 0; i < marks.size(); i++) {
            sum += i;
        }
        return sum / marks.size();
    }
}
