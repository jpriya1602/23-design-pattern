package Structural.Decorator;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return this.beverage.cost() + 40;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + " with Whip";
    }
}
