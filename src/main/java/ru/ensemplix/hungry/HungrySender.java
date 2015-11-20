package ru.ensemplix.hungry;

import org.bukkit.entity.Player;
import ru.ensemplix.command.CommandSender;

public class HungrySender implements CommandSender {
    Player player;

    HungrySender(Player player) {
        this.player = player;
    }

    @Override
    public void sendMessage(String message) {
        player.sendMessage(message);
    }
}
