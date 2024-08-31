package Structural.Flyweight.Model;

import Structural.Flyweight.Position;

public class Pawn implements ChessPieceFlyweight{
    private String color;
    private String type;

    public Pawn(String color, String type){
        System.out.println("creating pawn...");
        this.color = color;
        this.type = type;
    }

    @Override
    public void display(Position position) {
        String message = String.format("Placing %s %s at position %d, %d", color, type,position.getX(), position.getY());
        System.out.println(message);
    }
}
