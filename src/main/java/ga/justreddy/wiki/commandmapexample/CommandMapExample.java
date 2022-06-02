package ga.justreddy.wiki.commandmapexample;

import ga.justreddy.wiki.commandmapexample.commands.ExampleCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public final class CommandMapExample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        try {
            getCommandMap().register("hello", new ExampleCommand("hello", "Says hello", "/hello", null));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    // Getting access to the commandMap with reflection
    private CommandMap getCommandMap() throws IllegalAccessException, NoSuchFieldException {
        final Field field = Bukkit.getServer().getClass().getDeclaredField("commandMap");
        field.setAccessible(true);
        return (CommandMap) field.get(Bukkit.getServer());
    }

}
