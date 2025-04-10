import java.util.ArrayList;
import java.util.List;

public class LibraryInvoker {
    private List<LibraryCommand> commands;

    public LibraryInvoker() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(LibraryCommand command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (LibraryCommand command : commands) {
            command.execute();
        }
    }
}
