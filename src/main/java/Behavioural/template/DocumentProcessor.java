package Behavioural.template;

public abstract class DocumentProcessor {
        final void processDocument(){
            loadDocument();
            processContent();
            saveResult();

        }
        abstract void loadDocument();
        abstract void processContent();
        abstract void saveResult();
}
