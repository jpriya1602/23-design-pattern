package Structural.Decorator;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    abstract String getDescription();
}
