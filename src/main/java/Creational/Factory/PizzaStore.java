package Creational.Factory;

public class PizzaStore {

    private PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(){
        Pizza pizza = pizzaFactory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public static void main(String args[]){
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza();
    }

}
