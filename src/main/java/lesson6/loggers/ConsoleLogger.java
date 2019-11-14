package lesson6.loggers;

public class ConsoleLogger implements ILogger {

    @Override
    public void log(String message) {
        //TODO log to console
        System.out.println(message);
    }
}
