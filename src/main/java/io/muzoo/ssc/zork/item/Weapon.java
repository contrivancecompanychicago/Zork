package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.Player;

public abstract class Weapon extends AllItems{
    protected int attackBuff;


    public void getAction(Player player){
        int increasePlayerATK = attackBuff;
        player.increaseATK(increasePlayerATK);
    }


}
