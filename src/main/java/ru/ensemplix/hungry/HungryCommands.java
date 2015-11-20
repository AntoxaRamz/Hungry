package ru.ensemplix.hungry;

import ru.ensemplix.command.Command;

public class HungryCommands {
    @Command
    public void hello(HungrySender sender, String message) {
        sender.sendMessage(message);
    }

    @Command
    public void test(HungrySender sender, int message) {
        sender.sendMessage(message + "");
    }

    @Command
    public void hungry(HungrySender sender) {
        sender.sendMessage("Hello World");
    }
}
