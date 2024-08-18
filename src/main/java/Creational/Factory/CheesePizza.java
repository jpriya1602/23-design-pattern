package Creational.Factory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("cheese pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("cheese pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("cheese pizza box");

    }
}
