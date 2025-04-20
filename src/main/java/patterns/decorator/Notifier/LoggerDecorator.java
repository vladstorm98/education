package patterns.decorator.Notifier;

public class LoggerDecorator extends NotifierDecorator{
    public LoggerDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("INFO: " + message);
    }
}
