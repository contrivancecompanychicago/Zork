package io.muzoo.ssc.zork.map;

import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)
    {
        this.description = description;
        exits=new HashMap();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).

     */
    public void setExit(String direction,Room neighbor)
    {
        exits.put(direction,neighbor);
    }


    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    public Room getExit(String direction){
        return (Room)exits.get(direction);
    }


}
