package io.muzoo.ssc.zork.map;

import io.muzoo.ssc.zork.item.AllItems;
import io.muzoo.ssc.zork.monster.AllMonster;

import java.util.ArrayList;
import java.util.List;


public abstract class BuiltInMap {

    protected List<AllMonster> all_monster = new ArrayList<>();
    protected List<AllItems> all_item = new ArrayList<>();
    protected Room current;


    public Room getCurrentRoom(){ return current; }



    public void printStartRoom(){
        System.out.println("Welcome to the map" );
        System.out.println("You are currently in a deserted University campus");
        System.out.println("You can pick up items from rooms");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Lists of available item: ");
        for (AllItems i : all_item){
            if (i.getLocation() == current) {
                System.out.println( i.getName() + ": "+ i.getDescription() );
            }
        }
        System.out.println("");
        System.out.println("Use command take <name of item> to collect it to your inventory");
        System.out.println("");
        System.out.println( "Good luck");
    }

    public void setCurrent(String dirRoom){
        Room nextCurrent = current.getExit(dirRoom);
        if (nextCurrent != null) {
            current = nextCurrent;

        }

    }



    public void removeMonster(AllMonster monster){
        all_monster.remove(monster);
    }
    public boolean containMonsterInMap(){
        return all_monster.size() != 0;
    }

    public AllMonster checkMonster() {
        for (AllMonster i : all_monster){
            if (i.getLocation() == current){
                if (i.isAlive()) { return i; }
            }
        }
        return null;
    }

    public List<AllItems> checkItem(){
        List<AllItems> itemsList = new ArrayList<>();
        for (AllItems i : all_item){
            if (i.getLocation() == current){
                itemsList.add(i);
            }
        }
        return itemsList;
    }

    public void removeItem(AllItems item){ all_item.remove(item); }



}

