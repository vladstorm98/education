package patterns.command.CommandHandler;

public class PrintCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Printing the magazines");
    }
}
