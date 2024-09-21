package Behavioural.Memento;

public class Memento {

    private final StringBuilder text;

    public Memento(StringBuilder text){
        this.text = new StringBuilder(text);
    }

    public StringBuilder getText(){
        return new StringBuilder(text);
    }
}
