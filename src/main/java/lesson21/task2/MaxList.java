package lesson21.task2;

import java.util.Collection;
import java.util.Collections;

public class MaxList implements Runnable{
    Collection<Integer> collection;

    public MaxList(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        System.out.println("Max = " + Collections.max(collection));
    }
}
