package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class Lightsaber extends Weapon{

    public Lightsaber(Room locationInMap){
        name = "Lightsaber";
        description = "Weapon that will increase Players attack by 15 points";
        attackBuff = 7;
        location = locationInMap;
        isHeart = false;
    }

}
