package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.map.BuiltInMap;

import java.util.List;
import java.util.Scanner;

public class Game {

    private GameOutput output = new GameOutput();
    private Player player = new Player();
    private BuiltInMap builtInMap;

    private CommandParser commandParser = new CommandParser();
    public void run(){
        System.out.println("WELCOME TO ZORK \ntype help for further information");
        while (true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            command.execute(this,words.subList(1,words.size()));
            output.println(s);
        }
    }

    public GameOutput getOutput() {
        return output;
    }

    public Player getPlayer(){ return player; }

    public void exit(){
        System.exit(0);
    }

    public BuiltInMap getMap(){ return builtInMap; }

}
