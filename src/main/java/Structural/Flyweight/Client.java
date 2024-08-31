package Structural.Flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightChessPieceFactory flyweightChessPieceFactory = new FlyweightChessPieceFactory();
        flyweightChessPieceFactory.getChessPiece("pawn", "white");
    }
}
