package Creational.Factory;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Veggie pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Veggie pizza box");
    }
}
