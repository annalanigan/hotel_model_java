package Rooms;
import People.Guest;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Guest> checkedin;

    public Room(String name) {
        this.name = name;
        this.checkedin = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setCapacity(String name) {
        this.name = name;
    }

    public ArrayList<Guest> getCheckedin() {
        return checkedin;
    }

    public void setCheckedin(ArrayList<Guest> checkedin) {
        this.checkedin = checkedin;
    }
}
