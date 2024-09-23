package Behavioural.Mediator;

public class Client {
    public static void main(String[] args) {
        System.out.println("create user");

        User user1 = new User("user-1");
        User user2 = new User("user-2");
        User user3 = new User("user-3");

        Mediator mediator = new ConcreteMediator();

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi, Thanks for connecting");

    }
}
