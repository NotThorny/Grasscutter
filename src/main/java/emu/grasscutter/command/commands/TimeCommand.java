package emu.grasscutter.command.commands;

import emu.grasscutter.command.*;
import emu.grasscutter.game.player.Player;
import java.util.List;

@Command(
        label = "time",
        aliases = {"t"},
        usage = {"<(0-24)> (Below 0 goes back in time, greater than 24 loops around: 24 = 0, 25 = 1, etc.)"})
public final class TimeCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() < 1) {
            sendUsageMessage(sender);
            return;
        }

        try {
            int hour = Integer.parseInt(args.get(0));
            int time = hour * 60;

            targetPlayer.getWorld().changeTime(time, 1);
            CommandHandler.sendMessage(targetPlayer, "Changed time!");

        } catch (Exception e) {
            sendUsageMessage(sender);
        }
    }
}
