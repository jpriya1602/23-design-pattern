package Structural.Proxy;


public class DocumentProxy implements Document{
    private Document realDocument;

    /***lazy initialization***/
    @Override
    public void displayContent(String fileName) {
        if (realDocument == null){
            realDocument = new RealDocument();
        }

        realDocument.displayContent(fileName);
    }

    public static void main(String[] args) {
        DocumentProxy documentProxy = new DocumentProxy();
        documentProxy.displayContent("file.txt");

        documentProxy.displayContent("file.txt");
    }
}
