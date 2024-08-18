package Structural.Decorator;

public class DarkRoast extends Beverage {
    DarkRoast(){
        this.description = "Dark Roast";
    }
    @Override
    double cost() {
        return 20;
    }
}
