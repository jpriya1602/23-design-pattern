package Behavioural.Memento;

public class Document {
    private StringBuilder text;

    Document(){
        text = new StringBuilder();
    }

    public void addText(String text) {
        this.text.append(text);
    }

    public void getText(){
        System.out.println(this.text);
    }

    public Memento save(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getText();
    }
}
