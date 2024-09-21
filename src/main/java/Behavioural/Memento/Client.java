package Behavioural.Memento;

public class Client {
    public static void main(String[] args) {
        Document document = new Document();
        Command command = new Command(document);

        document.addText("Hello");
        command.saveCommand();
        document.addText(" World");
        command.saveCommand();
        document.addText("!");
        command.saveCommand();

        document.getText();

        command.undo();
        document.getText();

        command.undo();
        document.getText();

        command.undo();
        document.getText();

        command.undo();
    }
}
