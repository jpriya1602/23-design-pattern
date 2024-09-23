package Behavioural.Mediator;

public interface Mediator {
    void addUser(User user);
    void removeUser(User user);
    void sendMessage(User user, String message);
}
