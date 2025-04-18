package patterns.decorator.Notifier;

public class SmsDecorator extends NotifierDecorator {
    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS sent: " + message);
    }
}
