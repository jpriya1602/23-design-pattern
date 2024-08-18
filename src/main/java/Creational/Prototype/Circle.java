package Creational.Prototype;

public class Circle implements Shape{
    public String color;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle shape with " + color + " color" );
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }
}
