package Behavioural.template;

public class PdfDocumentProcessor extends DocumentProcessor{

    @Override
    void loadDocument() {
        System.out.println("loading pdf document");
    }

    @Override
    void processContent() {
        System.out.println("processing pdf file");
    }

    @Override
    void saveResult() {
        System.out.println("saving pdf file");
    }
}
