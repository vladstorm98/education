package patterns.mediiator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.mediator.Messenger.Messenger;
import patterns.mediator.Messenger.MessengerMediator;
import patterns.mediator.Messenger.User;

import static org.assertj.core.api.Assertions.assertThat;

public class MessengerTest {

    private static final String MESSAGE = "message";
    private static final String NAME_1 = "name1";
    private static final String NAME_2 = "name2";
    private static final String NAME_3 = "name3";

    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setUp() {
        MessengerMediator messenger = new Messenger();
        user1 = new User(NAME_1, messenger);
        user2 = new User(NAME_2, messenger);
        user3 = new User(NAME_3, messenger);

        messenger.addUser(user1);
        messenger.addUser(user2);
        messenger.addUser(user3);
    }

    @Test
    void shouldSendMessageFromFirstUser() {
        user1.send(MESSAGE);

        assertThat(user1.getReceivedMessages()).isEmpty();
        assertThat(user2.getReceivedMessages()).containsExactly(MESSAGE);
        assertThat(user3.getReceivedMessages()).containsExactly(MESSAGE);
    }

    @Test
    void shouldSendMessageFromLastUser() {
        user3.send(MESSAGE);

        assertThat(user3.getReceivedMessages()).isEmpty();
        assertThat(user1.getReceivedMessages()).containsExactly(MESSAGE);
        assertThat(user2.getReceivedMessages()).containsExactly(MESSAGE);
    }
}
