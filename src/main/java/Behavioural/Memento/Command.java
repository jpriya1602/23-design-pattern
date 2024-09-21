package Behavioural.Memento;

import java.util.ArrayList;

public class Command {

    private Document document;
    private ArrayList<Memento> snapshot;

    Command(Document document){
        this.document = document;
        this.snapshot = new ArrayList<>();
    }

    public void saveCommand(){
        snapshot.add(document.save());
    }

    public void undo(){
        if (snapshot.isEmpty()) {
            System.out.println("No snapshot available");
        }
        else{
            snapshot.remove(snapshot.size()-1);
            if(snapshot.isEmpty()){
                document.restore(new Memento(new StringBuilder()));
                System.out.println("Nothing left to undo");
            }
            else {
                document.restore(snapshot.get(snapshot.size() - 1));
            }
        }
    }
}
