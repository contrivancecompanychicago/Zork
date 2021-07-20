package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.map.Room;

public abstract class AllItems {
    protected String name;
    protected String description;
    protected Room location;
    protected boolean isHeart;

    public String getName(){ return name; }

    public String getDescription(){ return description; }

    public Room getLocation(){ return location; }

    public abstract void getAction(Player player);

    public boolean checkIsHeart(){ return isHeart; }



}
