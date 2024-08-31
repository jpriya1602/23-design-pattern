package Structural.Flyweight.Model;

import Structural.Flyweight.Model.ChessPieceFlyweight;
import Structural.Flyweight.Position;

import static java.lang.Math.abs;

public class Queen implements ChessPieceFlyweight {
    private final String type;
    private final String color;

    public Queen(String type, String color){
        this.type = type;
        this.color = color;
    }

    public Boolean canMoveTo(Position currentPosition, Position newPosition){
       int xdiff = abs(currentPosition.getX() - newPosition.getX());
       int ydiff = abs(currentPosition.getY() - newPosition.getY());

       return xdiff == 0 || ydiff == 0 || xdiff == ydiff;
    }

    @Override
    public void display(Position position) {
        String message = String.format("Placing %s %s at position %d, %d", color, type,position.getX(), position.getY());
        System.out.println(message);
    }
}
