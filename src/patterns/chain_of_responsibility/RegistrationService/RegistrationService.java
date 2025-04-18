package patterns.chain_of_responsibility.RegistrationService;

import java.util.HashSet;

public class RegistrationService {
    private final HashSet<String> users = new HashSet<>();

    public void register(UserInput input) {
        Validator chain = new UsernameValidator()
                .linkWith(new PasswordValidator())
                .linkWith(new UniqueUserValidator(users))
                .linkWith(new EmailValidator());

        chain.validate(input);

        users.add(input.name());
        System.out.println("User " + input.name() + " registered.");
    }
}
