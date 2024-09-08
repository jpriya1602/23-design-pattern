package Behavioural.ChainOfResponsibility;



public abstract class LoggerHandler {

   protected LoggerHandler handler;

   public void setHandler(LoggerHandler handler) {
      this.handler = handler;
   }
   public abstract void  handleRequest(LogLevel messageType, String message);
}
