package Structural.Flyweight;

import Structural.Flyweight.Model.ChessPieceFlyweight;

public interface ChessPieceFlyweightFactory {
    ChessPieceFlyweight getChessPiece(String type, String color);
}
