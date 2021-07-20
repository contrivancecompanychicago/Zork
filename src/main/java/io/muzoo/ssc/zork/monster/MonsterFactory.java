package io.muzoo.ssc.zork.monster;

import io.muzoo.ssc.zork.map.Room;

import java.lang.reflect.InvocationTargetException;

public class MonsterFactory {

    public static AllMonster createMonster(MonsterType monsterType, Room location){
        try{
            Class<? extends AllMonster> monster = monsterType.getMonsterClass();
            return monster.getConstructor(Room.class).newInstance(location);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
