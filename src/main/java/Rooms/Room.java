package Rooms;

import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> checkedin;

    public Room(int capacity) {
        this.capacity = capacity;
        this.checkedin = new ArrayList<>();
    }


}
