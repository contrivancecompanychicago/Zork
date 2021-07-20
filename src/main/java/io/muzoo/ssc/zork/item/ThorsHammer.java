package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class ThorsHammer extends Weapon{

    public ThorsHammer(Room locationInMap){
        name = "Thors Hammer";
        description = "Weapon that will increase Players attack by 7 points";
        attackBuff = 7;
        location = locationInMap;
        isHeart = false;
    }

}
