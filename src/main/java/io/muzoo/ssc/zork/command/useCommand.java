package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.item.AllItems;

import java.util.List;
import java.util.Locale;


public class useCommand implements Command {
    @Override
    public int numArgs(){
        return 1;
    }

    @Override
    public String getCommand() {
        return "use";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (args.size() == 0){
            StringBuilder string = new StringBuilder();
            string.append("Please specify what item will be used\nHint: Type info to see your inventory");
            game.getOutput().println(string.toString());
        }
        else{
            Player player = game.getPlayer();
            List<AllItems> itemsList = player.getInventoryList();
            String itemFromUser = String.join(" ", args);
            for (AllItems i : itemsList){
                if (i.getName().toLowerCase().equals(itemFromUser)){
                    if (i.checkIsHeart()){
                        i.getAction(player);
                        player.removeInventory(i);
                        game.getOutput().println("You have been healed by " + i.getName() + " potion");
                    }
                    else{
                        game.getOutput().println("Weapon can not use this way");
                    }
                    return;
                }
            }
            System.out.println("No item found");
        }
    }
}
