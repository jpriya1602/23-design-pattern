package Creational.Prototype;

public class ShapeClient {
    public static void main(String[] args) {
        Circle circle = new Circle("Green");
        Shape circle2 = circle.clone();

        circle.draw();
        circle2.draw();

    }
}
