package tasks.polymorphism.system_command_handler;

public class SaveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Saving redacted text to system");
    }
}
