package tasks.polymorphism.system_command_handler;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting from system");
    }
}
