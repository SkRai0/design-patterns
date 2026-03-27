package org.iamskrai.BehaviouralPatterns.TemplatePattern.Problem;

public class Cafe {

    public static void main(String[] args) {
        //Problem:
        //1. Both Tea and Coffee have almost identical preparation steps.
        //2. Common steps like "boiling water" and "pouring into cup" are duplicated.
        //3. Adding new beverage types requires duplicating the entire recipe structure.
        //4. Changing common steps requires updating all beverage classes.

        Tea tea = new Tea();
        System.out.println("Making tea...");
        tea.prepare();

        System.out.println();

        Coffee coffee = new Coffee();
        System.out.println("Making coffee...");
        coffee.prepare();
    }

}
