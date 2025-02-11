package tasks.polymorphism.system_command_handler;

import java.util.Map;

public class CommandHandler {
    private final Map<String, Command> commands;

    public CommandHandler(Map<String, Command> commands) {
        this.commands = commands;
    }

    public void executeCommand(String command) {
        Command cmd = this.commands.get(command);
        if (!isNull(cmd)) {
            cmd.execute();
        } else {
            System.out.println("Such command doesn't exist");
        }
    }

    private static boolean isNull(Command command) {
        return command == null;
    }

}
