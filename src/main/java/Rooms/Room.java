package Rooms;
import People.Guest;

import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> checkedin;

    public Room(int capacity) {
        this.capacity = capacity;
        this.checkedin = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getCheckedin() {
        return checkedin;
    }

    public void setCheckedin(ArrayList<Guest> checkedin) {
        this.checkedin = checkedin;
    }
}
