package lesson21.task2;

import java.util.Collection;
import java.util.Collections;

public class MinList implements Runnable {
    Collection<Integer> collection;

    public MinList(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        System.out.println("Min = " + Collections.min(collection));
    }
}
