package Structural.Decorator;

public class Expresso extends Beverage {
    public Expresso() {
        System.out.println("Expresso");
    }

    @Override
    double cost() {
        return 0;
    }
}
