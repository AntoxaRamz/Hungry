package ru.ensemplix.hungry;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import ru.ensemplix.command.CommandDispatcher;
import ru.ensemplix.command.CommandNotFoundException;

public class HungryPlugin extends JavaPlugin {

    private static CommandDispatcher dispatcher = new CommandDispatcher();

    public void onEnable() {
        dispatcher.register(new HungryCommands(), "hungry");
        Bukkit.getPluginManager().registerEvents(new HungryListener(), this);
    }

    public static boolean command(Player player, String message) {
        try {
            dispatcher.call(new HungrySender(player), message);
        } catch (CommandNotFoundException e) {
            return false;
        }
        return true;
    }
}
