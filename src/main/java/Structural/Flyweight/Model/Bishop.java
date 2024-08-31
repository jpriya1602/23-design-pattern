package Structural.Flyweight.Model;

import Structural.Flyweight.Position;

import static java.lang.Math.abs;

public class Bishop implements ChessPieceFlyweight {
    private final String type;
    private final String color;

    public Bishop(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public boolean canMove(Position currentPosition, Position newPosition){
        int xdiff = abs(currentPosition.getX() - newPosition.getX());
        int ydiff = abs(currentPosition.getY() - newPosition.getY());

        return xdiff == ydiff;
    }

    @Override
    public void display(Position position) {
        String message = String.format("Placing the %s %s in board at %d %d", type,color,position.getX(),position.getY());
        System.out.println(message);
    }
}
