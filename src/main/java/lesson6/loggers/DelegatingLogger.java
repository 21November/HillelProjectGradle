package lesson6.loggers;

public class DelegatingLogger implements ILogger {
    private final ILogger[] loggers;

    public DelegatingLogger(ILogger[] loggers) {
        this.loggers = loggers;
    }

    @Override
    public void log(String message) {
        for (ILogger logger : loggers){
            logger.log(message);
        }
    }

//    public void replaceLoggers(ILogger[] loggers) {
//        this.loggers = loggers;
//    }
}
