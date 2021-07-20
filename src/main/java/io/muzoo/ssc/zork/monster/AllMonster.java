package io.muzoo.ssc.zork.monster;

import io.muzoo.ssc.zork.map.Room;

public abstract class AllMonster {
    protected Room roomLocation;
    protected String name;
    protected int maxHp;
    protected int currentHp;
    protected int attack;


    public String getName(){ return name; }

    public int getAttack(){ return attack; }

    public Room getLocation(){ return roomLocation; }

    public void setDead(){
        roomLocation = null;
    }

    public boolean isAlive(){
        return roomLocation != null;
    }

    public void getAttackedFromPlayer(int damage){
        if (damage >= 0) {
            currentHp -= damage;
            if (currentHp <= 0){ setDead(); }
        }
    }

    public String printMonsterStat(){
        StringBuilder string = new StringBuilder();
        string.append("Monster: ").append(name).append("\n");
        string.append("| HP: ").append(currentHp).append("/").append(maxHp).append("\n");
        string.append("| Attack: ").append(attack).append("\n");
        return string.toString();
    }



}
