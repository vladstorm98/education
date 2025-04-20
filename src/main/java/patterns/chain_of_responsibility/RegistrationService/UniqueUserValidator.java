package patterns.chain_of_responsibility.RegistrationService;

import lombok.RequiredArgsConstructor;

import java.util.HashSet;

@RequiredArgsConstructor
public class UniqueUserValidator extends Validator {
    private final HashSet<String> users;

    @Override
    public void validate(UserInput input) {
        if (users.contains(input.name())) {
            throw new IllegalArgumentException("Username already exists");
        }
        validateNext(input);
    }
}
