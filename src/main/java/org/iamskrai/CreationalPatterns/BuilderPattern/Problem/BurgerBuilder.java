package org.iamskrai.CreationalPatterns.BuilderPattern.Problem;

public class BurgerBuilder {

    public static void main(String[] args) {
        //Problem:
        //1. Constructor has many parameters (6+), making it hard to read and remember parameter order.
        //2. Creating multiple overloaded constructors for different combinations leads to confusion and duplication.
        //3. When adding more optional fields, the constructor becomes unmanageable.
        //4. Hard to tell which parameters are optional vs required.

        // Must pass all parameters, most are defaults
        Burger burger = new Burger("Special", "Paneer", true, false, false, false);

        System.out.println(burger);
    }

}
