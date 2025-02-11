package tasks.polymorphism.system_command_handler;

public class PrintCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Printing the magazines");
    }
}
