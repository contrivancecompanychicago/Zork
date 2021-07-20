package io.muzoo.ssc.zork.map;

import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap exits;


    public Room(String description)
    {
        this.description = description;
        exits=new HashMap();
    }


    public void setExit(String direction,Room neighbor)
    {
        exits.put(direction,neighbor);
    }


    public String getDescription()
    {
        return this.description;
    }
    public Room getExit(String direction){
        return (Room)exits.get(direction);
    }

}
