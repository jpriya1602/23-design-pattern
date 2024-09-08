package Behavioural.ChainOfResponsibility;

public class ErrorLogger extends LoggerHandler {

    @Override
    public void handleRequest(LogLevel messageType, String message) {
        if(messageType == LogLevel.ERROR){
            String logMessage = String.format("Log type: %s, message: %s", messageType, message );
            System.out.println(logMessage);
        }
        else if(handler != null){
            handler.handleRequest(messageType, message);
        }
        else{
            System.out.println("No logger found to handle the request");
        }
    }
}
