package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.item.AllItems;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private List<AllItems> inventory;
    private final int MaxHP;
    private int currentHp;
    private int attackPower;


    public Player(){
        MaxHP = 100;
        currentHp = 100;
        attackPower = 5;
        inventory = new ArrayList<>();
    }

    public void getAttackedFromMonster(int damageFromMonster){
        int damage_taken = damageFromMonster;
        if (damage_taken >= 0){
            currentHp -= damage_taken;
        }
    }

    public void increaseHp(int HPhealing){
        currentHp += HPhealing;
        if (currentHp > MaxHP){
            currentHp = MaxHP;
        }
    }

    public List<AllItems> getInventoryList(){ return inventory; }

    public void addInventory(AllItems items){ inventory.add(items); }

    public void removeInventory(AllItems item){ inventory.remove(item); }

    public void increaseATK(int attackBuff){
        attackPower += attackBuff;
    }

    public int getMaxHp(){
        return MaxHP;
    }

    public int getCurrentHp(){
        return currentHp;
    }


    public int getATK(){
        return attackPower;
    }

    public void setDefaultATK(int defaultATK){ attackPower = defaultATK; }

}
