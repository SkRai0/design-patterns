package org.iamskrai.BehaviouralPatterns.TemplatePattern.Solution;

public class Cafe {

    public static void main(String[] args) {
        //Solution:
        //1. We have created an abstract class Beverage which has a template method prepareRecipe() that defines the steps to prepare a beverage.
        //2. The concrete classes Tea and Coffee extend the Beverage class and implement the abstract methods brew() and addCondiments() to provide specific implementations for tea and coffee.
        
        Tea tea = new Tea();
        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println();

        Coffee coffee = new Coffee();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }

}
