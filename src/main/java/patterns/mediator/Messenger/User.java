package patterns.mediator.Messenger;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class User {
    private final String name;
    private final MessengerMediator mediator;
    private final List<String> receivedMessages = new ArrayList<>();

    public User(String name, MessengerMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(name + " sent: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
        receivedMessages.add(message);
    }
}
