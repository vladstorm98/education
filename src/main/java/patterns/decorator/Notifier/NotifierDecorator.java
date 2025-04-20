package patterns.decorator.Notifier;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier notifier;

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
