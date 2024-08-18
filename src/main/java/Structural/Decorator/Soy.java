package Structural.Decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return this.beverage.cost() + 50;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + " with Soy";
    }
}
