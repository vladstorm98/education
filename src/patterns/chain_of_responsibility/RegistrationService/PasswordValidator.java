package patterns.chain_of_responsibility.RegistrationService;

public class PasswordValidator extends Validator {
    @Override
    public void validate(UserInput input) {
        String password = input.password();
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
        validateNext(input);
    }
}
