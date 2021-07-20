package io.muzoo.ssc.zork.item;

public enum ItemsType {
    REDHEART(RedHeart.class),
    BLUEHEART(BlueHeart.class),
    YELLOWHEART(YellowHeart.class),
    SHOTGUN(Shotgun.class),
    THORSHAMMER(ThorsHammer.class),
    LIGHTSABER(Lightsaber.class);

    private Class<? extends AllItems> ITEMS_CLASS;

    ItemsType(Class<? extends AllItems> ItemClass){
        this.ITEMS_CLASS = ItemClass;
    }

    public Class<? extends AllItems> getItemsClass(){
        return this.ITEMS_CLASS;
    }
}
