package Rooms;

import People.Guest;

import java.util.ArrayList;

public class PublicRoom extends Room{

    private String type;
    private ArrayList<Guest> bookedIn;

    public PublicRoom(String name, int capacity, String type) {
        super(name, capacity);
        this.type = type;
    }

    public ArrayList<Guest> getBookedIn() {
        return bookedIn;
    }

    public void setBookedIn(ArrayList<Guest> bookedIn) {
        this.bookedIn = bookedIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
