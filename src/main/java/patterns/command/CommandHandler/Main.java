package patterns.command.CommandHandler;

// Exercise: Realize system of command with polymorphism.
//
// Requirements:
//   There is command - Command, which has method - execute().
//   Different commands perform different actions.
//   Commands sign up in Map<String, Command>.
//   You can find needed command by the String and execute it.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Command> commands = new HashMap<>();
        commands.put("print", new PrintCommand());
        commands.put("save", new SaveCommand());
        commands.put("exit", new ExitCommand());

        CommandHandler handler = new CommandHandler(commands);
        handler.executeCommand("print");
        handler.executeCommand("exit");
    }
}
