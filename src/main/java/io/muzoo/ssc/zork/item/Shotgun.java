package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class Shotgun extends Weapon{

    public Shotgun(Room locationInMap){
        name = "Shotgun";
        description = "Weapon that will increase Players attack by 10 points";
        attackBuff = 10;
        location = locationInMap;
        isHeart = false;
    }
}
