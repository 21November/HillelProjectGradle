package lesson8;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyOptional <T> {

    private T type;

    private MyOptional(T type) {
        this.type = type;
    }

    public void setValue(T type){
        this.type = type;
    }

    public boolean isPresent (){
        return type != null;
    }

    public T getValue() {
        if (type == null){
            throw new NoSuchElementException ("Exception: null!");
        }
        return type;
    }

    public static <T> MyOptional<T> myOf(T value){
        if (value == null){
            throw new NullPointerException("Exception: null!");
        }

        return new MyOptional<>(value);
    }

    public static <T> MyOptional<T> myOfNullable (T value){
        return new MyOptional<>(value);

    }

    public static <T> MyOptional<T> myEmpty (){
        return new MyOptional<>(null);
    }

    public T myOrElse (T value){
        if (isPresent()){
            return value;
        }
        return this.type;
        // TODO Какаое другое значение нужно вернуть?
    }

    public boolean myEquals (Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this == obj && type.equals(obj);
    }

    public int myHashCode() {
        return Objects.hash(type);
    }


}
