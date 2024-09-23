package Behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<User> users;

    ConcreteMediator(){
        users = new ArrayList<>();
    }
    @Override
    public void addUser(User user) {
        users.add(user);
        user.setMediator(this); // set mediator for the user
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for(User user: users){
            if (user != sender){
                user.receiveMessage(sender, message);
            }
        }
    }
}
