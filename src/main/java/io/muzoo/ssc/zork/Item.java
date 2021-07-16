package io.muzoo.ssc.zork;

public abstract class Item {

    private String name;

    private int damage;

    public Item() {

    }
    /*public String name() {
        return this.name;
    }
    public int attack() {
        return this.damage;
    }*/
    public Item name(final String newName) {
        this.name = newName;
        return this;
    }

    public Item attack(final int power) {
        this.damage = power;
        return this;
    }
}
