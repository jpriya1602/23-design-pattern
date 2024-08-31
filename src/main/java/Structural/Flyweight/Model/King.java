package Structural.Flyweight.Model;

import Structural.Flyweight.Model.ChessPieceFlyweight;
import Structural.Flyweight.Position;

import static java.lang.Math.abs;

public class King implements ChessPieceFlyweight {
    private final String type;
    private final String color;
    public King(String type, String color){
        System.out.println("creating king");
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
    public boolean canMoveTo(Position currentPosition, Position newPosition){
        int xdiff = abs(currentPosition.getX() - newPosition.getX());
        int ydiff = abs(currentPosition.getY() - newPosition.getY());

        return xdiff <= 1 && ydiff <= 1;

    }

    @Override
    public void display(Position position) {
        String message = String.format("Placing %s %s at position %d, %d", color, type,position.getX(), position.getY());
        System.out.println(message);
    }
}
