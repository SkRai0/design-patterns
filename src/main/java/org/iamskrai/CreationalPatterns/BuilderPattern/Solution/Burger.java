package org.iamskrai.CreationalPatterns.BuilderPattern.Solution;

public class Burger {

    private String bun;
    private String patty;
    private Boolean cheese;
    private Boolean lettuce;
    private Boolean tomato;
    private Boolean pickles;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.pickles = builder.pickles;
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

    public static class Builder {
        private String bun = "Regular";
        private String patty = "Chicken";
        private Boolean cheese = false;
        private Boolean lettuce = false;
        private Boolean tomato = false;
        private Boolean pickles = false;

        public Builder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public Builder setCheese(Boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setLettuce(Boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder setTomato(Boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder setPickles(Boolean pickles) {
            this.pickles = pickles;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
