package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;

public class RedHeart extends Heart {

    public RedHeart(Room locationInMap){
        name = "Red Heart";
        description = "Heart that heals 20 HP";
        HPhealing = 20;
        location = locationInMap;
        isHeart = true;
    }
}
