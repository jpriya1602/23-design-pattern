package Behavioural.Mediator;

public class User {
    private String userName;
    private Mediator mediator;
    User(String userName){
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        mediator.sendMessage(this, message);
    }

    public void receiveMessage(User sender, String message){
        String formattedMessage = String.format("Received message from %s : %s", sender.userName, message);
        System.out.println(formattedMessage);
    }
}
