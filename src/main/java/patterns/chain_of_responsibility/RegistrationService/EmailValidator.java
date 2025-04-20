package patterns.chain_of_responsibility.RegistrationService;

public class EmailValidator extends Validator {
    @Override
    public void validate(UserInput input) {
        String email = input.email();
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        validateNext(input);
    }
}
