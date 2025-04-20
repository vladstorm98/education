package patterns.command.CommandHandler;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting from system");
    }
}
