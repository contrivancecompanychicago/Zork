package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.item.AllItems;

import java.util.List;
import java.util.Locale;


public class dropCommand implements Command {
    @Override
    public int numArgs(){
        return 1;
    }


    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (args.size() == 0) {
            StringBuilder string = new StringBuilder();
            string.append("Please specify the item to drop\nHint: Type info to see your inventory");
            game.getOutput().println(string.toString());
        } else {
            Player player = game.getPlayer();
            String itemFromUser = String.join(" ", args);
            List<AllItems> itemList = player.getInventoryList();
            for (AllItems i : itemList) {
                if (i.getName().toLowerCase().equals(itemFromUser)) {
                    player.removeInventory(i);
                    game.getOutput().println(i.getName() + " has been removed to your inventory");
                    return;
                }
            }
            game.getOutput().println("No item matched");
        }
    }
}

