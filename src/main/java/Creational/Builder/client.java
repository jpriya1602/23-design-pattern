package Creational.Builder;

public class client {
    public static void main(String[] args) {
        /*** Pizza 1: method chaining ***/
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder("Large", "Thin").setCheeseType("Mozzarella").setToppings("Pepperoni").setSauce("Tomato");
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza);


        /*** Pizza 2 ***/
        Pizza.PizzaBuilder pizzaBuilder2 = new Pizza.PizzaBuilder("Medium", "Thick").setCheeseType("Cheddar").setToppings("Mushrooms"); //method chaining
        Pizza pizza2 = pizzaBuilder2.build();
        System.out.println(pizza2);
    }
}
