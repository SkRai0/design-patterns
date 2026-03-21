package org.iamskrai.CreationalPatterns.SingletonPattern.Solution;

public class Main {

    public static void main(String[] args) {
        //Solution:
        //1. Create a private static variable to hold the single instance of the class.
        //2. Make the constructor private to prevent instantiation from outside the class.
        //3. Use synchronized block to ensure thread safety when creating the instance.

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This a log message from the same logger instance.");
        logger2.log("This is another log message from the same logger instance.");

    }

}
