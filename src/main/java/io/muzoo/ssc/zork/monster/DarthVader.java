package io.muzoo.ssc.zork.monster;

import io.muzoo.ssc.zork.map.Room;

public class DarthVader extends AllMonster{

    public DarthVader(Room location){
        name = "Darth Vader";
        roomLocation = location;
        maxHp = 15;
        currentHp = maxHp;
        attack = 5;

    }
}
