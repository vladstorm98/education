package patterns.chain_of_responsibility.RegistrationService;

public class UsernameValidator extends Validator {
    @Override
    public void validate(UserInput input) {
        String name = input.name();
        if (name.length() < 4) {
            throw new IllegalArgumentException("Name must be at least 4 characters long");
        }
        validateNext(input);
    }
}
