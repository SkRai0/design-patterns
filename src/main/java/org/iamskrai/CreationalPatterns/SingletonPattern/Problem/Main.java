package org.iamskrai.CreationalPatterns.SingletonPattern.Problem;

public class Main {

    public static void main(String[] args){
        //Problem:
        //1. Multiple instances of Logger can be created, which can lead to inconsistent logging and resource management issues.
        //2. It can be difficult to manage the lifecycle of the Logger instances, especially in larger applications where multiple components may need to log messages.
        Logger logger = new Logger();
        logger.log("This is a log message.");
        Logger anotherLogger = new Logger();
        anotherLogger.log("This is another log message.");
    }

}
