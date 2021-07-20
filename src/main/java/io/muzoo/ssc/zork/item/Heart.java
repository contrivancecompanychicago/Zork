package io.muzoo.ssc.zork.item;

import io.muzoo.ssc.zork.Player;

public abstract class Heart extends AllItems {
    protected int HPhealing;


    public int getHphealing(){ return HPhealing; }

    public void getAction(Player player){
        player.increaseHp(HPhealing);
    }
}
