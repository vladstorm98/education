package patterns.chain_of_responsibility.RegistrationService;

public abstract class Validator {
    protected Validator next;

    public Validator linkWith(Validator next) {
        if (isNext()) {
            this.next.linkWith(next);
        } else {
            this.next = next;
        }
        return this;
    }

    protected void validateNext(UserInput input) {
        if (isNext()) {
            next.validate(input);
        }
    }

    public abstract void validate(UserInput input);

    private boolean isNext() {
        return next != null;
    }
}
