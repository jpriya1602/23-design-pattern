package Structural.Proxy;


public class RealDocument implements Document {

    RealDocument(){
        System.out.println("Initialized real document once!");
    }

    @Override
    public void displayContent(String fileName) {
        System.out.println("Displaying document...");
        System.out.println("Loading document from disk...");
        System.out.println("This is the content of the document.");
    }
}
