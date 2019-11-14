package lesson12;

public class MyDomainException extends Exception {


    public MyDomainException(String string, Throwable e){
        super(string, e);
    }

    public MyDomainException(){

    }
}
