package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class BlueHeart extends Heart {

    public BlueHeart(Room locationInMap){
        name = "Blue Heart";
        description = "Heart that heals  HP";
        HPhealing = 15;
        location = locationInMap;
        isHeart = true;
    }
}
