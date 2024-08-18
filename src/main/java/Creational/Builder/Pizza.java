package Creational.Builder;

public class Pizza {
    private final String size;
    private final String crustType;
    private final String cheeseType;
    private final String toppings;
    private final String sauce;

    // private constructor to prevent direct instantiation
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.crustType = pizzaBuilder.crustType;
        this.cheeseType = pizzaBuilder.cheeseType;
        this.toppings = pizzaBuilder.toppings;
        this.sauce = pizzaBuilder.sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", cheeseType='" + cheeseType + '\'' +
                ", toppings='" + toppings + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    static class PizzaBuilder {
        private final String size; // make required as final
        private final String crustType; // make required as final
        private String cheeseType; //
        private String toppings;
        private String sauce;

        public PizzaBuilder(String size, String crustType) {
            this.size = size;
            this.crustType = crustType;
        }

        public PizzaBuilder setCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public PizzaBuilder setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


}
