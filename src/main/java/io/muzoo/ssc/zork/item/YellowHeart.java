package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class YellowHeart extends Heart {

    public YellowHeart(Room locationInMap){
        name = "Yellow Heart";
        description = "Heart that heals 10 HP";
        HPhealing = 10;
        location = locationInMap;
        isHeart = true;
    }
}
