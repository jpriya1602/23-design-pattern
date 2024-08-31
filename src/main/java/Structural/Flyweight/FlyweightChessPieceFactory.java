package Structural.Flyweight;

import Structural.Flyweight.Model.*;

import java.util.HashMap;
import java.util.Map;

class FlyweightChessPieceFactory implements ChessPieceFlyweightFactory {

    private final Map<String, ChessPieceFlyweight> pieceMap = new HashMap<>();

    @Override
    public ChessPieceFlyweight getChessPiece(String type, String color) {
        String key = type + "-" + color;
        if(!pieceMap.containsKey(key)){
            ChessPieceFlyweight piece = createChessPiece(type, color);
            pieceMap.put(key, piece);
        }
        return pieceMap.get(key);
    }

    private ChessPieceFlyweight createChessPiece(String type, String color){
        return switch (type.toLowerCase()){
            case "pawn" -> new Pawn(type, color);
            case "rook" -> new Rook(type, color);
            case "queen" -> new Queen(type, color);
            case "knight" -> new Knight(type,color);
            case "bishop" -> new Bishop(type,color);
            case "king" -> new King(type,color);
            default -> throw new IllegalArgumentException("Invalid piece type: " + type);
        };
    }

}
