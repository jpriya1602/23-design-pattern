package Behavioural.template;

public class WordDocumentProcessor extends DocumentProcessor{
    @Override
    void loadDocument() {
        System.out.println("loading word document");
    }

    @Override
    void processContent() {
        System.out.println("processing the word document content");
    }

    @Override
    void saveResult() {
        System.out.println("save the word document");
    }
}
