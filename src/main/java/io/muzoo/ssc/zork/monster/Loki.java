package io.muzoo.ssc.zork.monster;

import io.muzoo.ssc.zork.map.Room;

public class Loki extends AllMonster{

    public Loki(Room location){
        name = "Loki";
        roomLocation = location;
        maxHp = 20;
        currentHp = maxHp;
        attack = 5;

    }
}
