package org.iamskrai.CreationalPatterns.BuilderPattern.Solution;

public class BurgerBuilder {

    public static void main(String[] args) {
        //Problem: 
        //1. Creating a complex object (Burger) with multiple optional parameters can lead to a constructor with many parameters, which is hard to read and maintain.
        //2. Creating multiple constructors for different combinations of parameters can lead to code duplication and confusion.

        //Solution:
        //1. The Builder pattern allows us to create a complex object step by step, providing a clear and fluent interface for setting optional parameters.
        //2. The Builder class encapsulates the construction logic, making it easier to manage and maintain the code.
        Burger burger = new Burger.Builder()
                .setBun("Special")
                .setCheese(true)
                .setPatty("Paneer")
                .build();

        System.out.println(burger);
    }
}
