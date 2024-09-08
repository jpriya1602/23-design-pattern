package Behavioural.ChainOfResponsibility;


public class Client {
    public static void main(String[] args) {
        LoggerHandler infoLogger = new InfoLogger();
        LoggerHandler warningLogger = new WarningLogger();
        LoggerHandler errorLogger = new ErrorLogger();

        infoLogger.setHandler(warningLogger);
        warningLogger.setHandler(errorLogger);

        infoLogger.handleRequest(LogLevel.ERROR, "Out of bounds exception");
    }
}
