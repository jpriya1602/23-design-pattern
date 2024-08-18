package Structural.Decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return this.beverage.cost() + 30;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + " with Mocha";
    }
}
