package Creational.Prototype;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}
