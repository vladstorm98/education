package patterns.mediator.Messenger;

import java.util.ArrayList;
import java.util.List;

public class Messenger implements MessengerMediator {
    private final List<User> users;

    public Messenger() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        users.forEach(user -> {
            if (!sender.equals(user)) {
                user.receive(message);
            }
        });
    }
}
