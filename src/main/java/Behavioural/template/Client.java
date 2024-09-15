package Behavioural.template;

public class Client {
    public static void main(String[] args) {
       DocumentProcessor pdfDocumentProcessor = new PdfDocumentProcessor();
       pdfDocumentProcessor.processDocument();

        System.out.println("******");

       WordDocumentProcessor wordDocumentProcessor = new WordDocumentProcessor();
       wordDocumentProcessor.processDocument();
    }
}
