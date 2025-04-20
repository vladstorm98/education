package patterns.decorator.Notifier;

public class TelegramDecorator extends NotifierDecorator {
    public TelegramDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Telegram notification sent: " + message);
    }
}
