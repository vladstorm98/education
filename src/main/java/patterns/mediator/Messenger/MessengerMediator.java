package patterns.mediator.Messenger;


public interface MessengerMediator {
    void addUser(User user);
    void sendMessage(String message, User user);
}
