package io.muzoo.ssc.zork.monster;

public enum MonsterType {
    ZOMBIE(Zombie.class),
    DARTHVADER(DarthVader.class),
    LOKI(Loki.class);

    private Class<? extends AllMonster> MONSTER;

    MonsterType(Class<? extends AllMonster> monsterClass){
        this.MONSTER = monsterClass;
    }

    public Class<? extends AllMonster> getMonsterClass(){
        return MONSTER;
    }



}
