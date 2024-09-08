package Behavioural.ChainOfResponsibility;

public class InfoLogger extends LoggerHandler {
    @Override
    public void handleRequest(LogLevel messageType, String message) {
        if(messageType == LogLevel.INFO){
            String logMessage = String.format("Log type: %s, message: %s", messageType, message );
            System.out.println(logMessage);
        }
        else if(handler != null){
            System.out.println("Not info type, passing to next handler"); // reading purpose
            handler.handleRequest(messageType, message);
        }
        else {
            System.out.println("No logger found to handle the request");
        }
    }

}
