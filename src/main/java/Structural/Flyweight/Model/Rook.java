package Structural.Flyweight.Model;

import Structural.Flyweight.Model.ChessPieceFlyweight;
import Structural.Flyweight.Position;

import static java.lang.Math.abs;

public class Rook implements ChessPieceFlyweight {
    private final String type;
    private final String color;

    public Rook(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public boolean canMove(Position currentPosition, Position newPosition) {
        int xdiff = abs(currentPosition.getX() - newPosition.getX());
        int ydiff = abs(currentPosition.getY() - newPosition.getY());

        return xdiff == 0 || ydiff == 0;
    }

    @Override
    public void display(Position position) {
        String message = String.format("Placing the %s %s in board at %d %d", type,color,position.getX(),position.getY());
        System.out.println(message);
    }
}
