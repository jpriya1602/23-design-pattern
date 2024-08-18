package Structural.Decorator;

public class Milk extends CondimentDecorator{
    Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return this.beverage.cost() + 20;
    }

    @Override
    String getDescription() {
        return this.beverage.getDescription() + " with Milk";
    }
}
