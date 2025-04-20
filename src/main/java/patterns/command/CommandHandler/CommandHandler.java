package patterns.command.CommandHandler;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class CommandHandler {
    private final Map<String, Command> commands;

    public void executeCommand(String command) {
        Command cmd = commands.get(command);
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
