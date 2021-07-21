package io.muzoo.ssc.zork.map;

public class Map extends BuiltInMap{
    private final Room outside, theater, pub, lab, office,play,gym,auditorium,research;
    public Map(){
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        play = new Room("in the official campus games room");
        gym = new Room("in the campus gymnasium");
        auditorium = new Room("in the campus auditorium");
        research = new Room("in the official campus research center");


        outside.setExit("east",theater);
        outside.setExit("south", lab);
        outside.setExit("west",pub);

        theater.setExit("west",outside);
        theater.setExit("up",auditorium);


        lab.setExit("north", outside);
        lab.setExit("east", office);
        lab.setExit("up", research);

        office.setExit("west",lab);


        pub.setExit("east",outside);
        pub.setExit("up",play);

        play.setExit("up", gym);
        play.setExit("down", pub);

        gym.setExit("down", play);

        auditorium.setExit("down", theater);

        research.setExit("down", lab);







    }
}
