package ga.justreddy.wiki.commandmapexample.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;


// Extending org.bukkit.command.Command
public class ExampleCommand extends Command {


    /**
     * @param name - The name of the command
     * @param description - The description of the command
     * @param usageMessage - the usage message of the command
     * @param aliases - the aliases of the command ( can be null )
     */
    public ExampleCommand(String name, String description, String usageMessage, List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {

        // Sending a message to the one who executed the command
        sender.sendMessage("Hello!");

        // return true because yes
        return true;
    }
}
