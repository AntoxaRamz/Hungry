package ru.ensemplix.hungry;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class HungryListener implements Listener {
    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        if(HungryPlugin.command(event.getPlayer(), event.getMessage())) {
            event.setCancelled(true);
        }
    }
}
