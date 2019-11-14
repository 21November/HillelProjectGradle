package lesson21.task1;

import java.util.Collection;

public class CollectionNumber implements Runnable {
    Collection<Integer> collection;


    public CollectionNumber(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        for (Integer integer : collection){
            System.out.println(integer);
        }
    }
}
