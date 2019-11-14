package lesson6;

import lesson6.loggers.ILogger;

public class AuthenticationService {
    private final ILogger logger;

    public AuthenticationService(ILogger logger) {
        this.logger = logger;
    }

    public void authenticate (String userName, String password){
        logger.log("User " + userName + " with password " +
                password + " tries to authenticate");

        //TODO send a command to web server
    }
}
