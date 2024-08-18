package Creational.Factory;

public class ClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Clam pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Clam pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Clam pizza box");

    }
}
