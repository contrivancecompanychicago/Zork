package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.item.AllItems;
import io.muzoo.ssc.zork.map.BuiltInMap;


import java.util.List;
import java.util.Locale;


public class takeCommand implements Command {
    @Override
    public int numArgs(){
        return 1;
    }


    @Override
    public String getCommand() {
        return "take";
    }


    @Override
    public void execute(Game game, List<String> args) {
        if (args.size() == 0){
            StringBuilder string = new StringBuilder();
            string.append("Please specify the item to take\n");
            string.append("Hint: Type info to see your inventory");
            game.getOutput().println(string.toString());
        }
        else {
            Player player = game.getPlayer();
            BuiltInMap map = game.getMap();
            String itemFromUser = String.join(" ", args);
            List<AllItems> itemList = game.getMap().checkItem();
            for (AllItems i : itemList){
                if (i.getName().toLowerCase().equals(itemFromUser)){
                    player.addInventory(i);
                    map.removeItem(i);
                    game.getOutput().println(i.getName() + " has been added to your inventory");
                    return;
                }
            }
            game.getOutput().println("No item matched");
        }
    }
}
