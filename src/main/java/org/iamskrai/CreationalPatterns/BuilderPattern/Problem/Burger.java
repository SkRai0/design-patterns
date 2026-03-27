package org.iamskrai.CreationalPatterns.BuilderPattern.Problem;

public class Burger {

    private String bun;
    private String patty;
    private Boolean cheese;
    private Boolean lettuce;
    private Boolean tomato;
    private Boolean pickles;

    public Burger(String bun, String patty, Boolean cheese, Boolean lettuce, Boolean tomato, Boolean pickles) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
    }

    public String getBun() {
        return bun;
    }

    public String getPatty() {
        return patty;
    }

    public Boolean getCheese() {
        return cheese;
    }

    public Boolean getLettuce() {
        return lettuce;
    }

    public Boolean getTomato() {
        return tomato;
    }

    public Boolean getPickles() {
        return pickles;
    }

    public String toString() {
        return "Burger [bun=" + bun + ", patty=" + patty + ", cheese=" + cheese + ", lettuce=" + lettuce
                + ", tomato=" + tomato + ", pickles=" + pickles + "]";
    }

}
