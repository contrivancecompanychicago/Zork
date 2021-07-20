package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.map.Room;


import java.lang.reflect.InvocationTargetException;

public class ItemFactory {

    public static AllItems createItems(ItemsType itemType, Room location){
        try{
            Class<? extends io.muzoo.ssc.zork.item.AllItems> monster = itemType.getItemsClass();
            return monster.getConstructor(Room.class).newInstance(location);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

}
