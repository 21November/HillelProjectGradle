package lesson6;

import lesson6.loggers.*;

public class Main {

    public static void main(String[] args) {
        ILogger logger1 = new ConsoleLogger();
        ILogger logger2 = new FileLogger();
        ILogger logger3 = new MysqlDirectLogger();
        ILogger logger4 = new NullLogger();
        ILogger logger = new DelegatingLogger(new ILogger[]{
                new ConsoleLogger(),
                new FileLogger(),
                logger1,
                logger2,
                logger3,
                logger4
        });


        AuthenticationService authenticationService =
                new AuthenticationService(logger);

        authenticationService.authenticate("user", "12345678");

    }
}
