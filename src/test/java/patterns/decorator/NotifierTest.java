package patterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.decorator.Notifier.EmailNotifier;
import patterns.decorator.Notifier.LoggerDecorator;
import patterns.decorator.Notifier.Notifier;
import patterns.decorator.Notifier.SmsDecorator;
import patterns.decorator.Notifier.TelegramDecorator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotifierTest {

    private static final String MESSAGE = "message";

    private ByteArrayOutputStream out;

    @BeforeEach
    void setup() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    void testEmailNotifier() {
        Notifier notifier = new EmailNotifier();
        notifier.send(MESSAGE);

        assertTrue(out.toString().contains("Email sent: " + MESSAGE));
    }

    @Test
    void testSmsDecorator() {
        Notifier notifier = new SmsDecorator(new EmailNotifier());
        notifier.send(MESSAGE);

        assertTrue(out.toString().contains("Email sent: " + MESSAGE));
        assertTrue(out.toString().contains("SMS sent: " + MESSAGE));
    }

    @Test
    void testTelegramDecorator() {
        Notifier notifier = new TelegramDecorator(new EmailNotifier());
        notifier.send(MESSAGE);

        assertTrue(out.toString().contains("Email sent: " + MESSAGE));
        assertTrue(out.toString().contains("Telegram notification sent: " + MESSAGE));
    }

    @Test
    void testLoggerDecorator() {
        Notifier notifier = new LoggerDecorator(new EmailNotifier());
        notifier.send(MESSAGE);

        assertTrue(out.toString().contains("Email sent: " + MESSAGE));
        assertTrue(out.toString().contains("INFO: " + MESSAGE));
    }

    @Test
    void testAllDecorators() {
        Notifier notifier = new SmsDecorator(
                new LoggerDecorator(
                        new TelegramDecorator(
                                new EmailNotifier())));

        notifier.send(MESSAGE);

        assertTrue(out.toString().contains("Email sent: " + MESSAGE));
        assertTrue(out.toString().contains("INFO: " + MESSAGE));
        assertTrue(out.toString().contains("SMS sent: " + MESSAGE));
        assertTrue(out.toString().contains("Telegram notification sent: " + MESSAGE));
    }
}
