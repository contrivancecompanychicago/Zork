package io.muzoo.ssc.zork.monster;

import io.muzoo.ssc.zork.map.Room;

public class Zombie extends AllMonster{
    public Zombie(Room location){
        name = "Zombie";
        roomLocation = location;
        maxHp = 10;
        currentHp = maxHp;
        attack = 5;

    }
}
