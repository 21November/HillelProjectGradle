package lesson10;

public class Triplet<T,U, V> {
    private final T first;
    private final U second;
    private final V third;

    public static <T,U, V> Triplet<T,U, V> createPair(T first, U second, V third) {
        return new Triplet<T,U, V>(first, second, third);
    }

    public  Triplet(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
