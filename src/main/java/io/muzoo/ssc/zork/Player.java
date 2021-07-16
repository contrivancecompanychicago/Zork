package io.muzoo.ssc.zork;

import java.util.List;
import java.util.ArrayList;

public class Player {

    private int hp;

    private int maxHp;

    private String name;

    private final List<Item> inventory;

    private boolean dead =false;





    public Player(final int hp, final String name) {
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public String currentDescription() {
        final StringBuilder desc = new StringBuilder();
        desc.append(this.name);
        desc.append('\n');
        desc.append(" You have ").append(this.hp).append("Hp");
        desc.append('\n');
        desc.append("Your max Hp is ").append(this.maxHp).append("Hp");
        desc.append('\n');
        return desc.toString();
    }

    public String getName() {
        return this.name;
    }

    public void rename(final String newName) {
        this.name = newName;
    }

    public void addItem(final Item item) {
        this.inventory.add(item);
    }

    public void removeItem(final Item item) {
        this.inventory.remove(item);
    }

    /**
     * Return inventory of the player.
     * @return - List of item.
     */
    public List<Item> getInventory() {
        return this.inventory;
    }


    public void setHp( int n) {
        this.hp = n;
    }


    public int getHp() {
        return this.hp;
    }


    public void addHp( int n) {
        this.hp += n;
    }

    public void setMaxHp( int n) {
        this.maxHp = n;
    }


    public int getMaxHp() {
        return this.maxHp;
    }

    public boolean setDead(String name){
        return this.dead=true;
    }


}
