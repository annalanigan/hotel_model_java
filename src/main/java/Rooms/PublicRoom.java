package Rooms;

import People.Guest;

import java.util.ArrayList;

public class PublicRoom extends Room{

    private String type;
    private ArrayList<Guest> bookedIn;

    public PublicRoom(String name, int capacity, String type) {
        super(name, capacity);
        this.type = type;
        this.bookedIn = new ArrayList<>();
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

    public int getInhouse(){
        return this.bookedIn.size();
    }

    public boolean checkAvailable(){
        return this.bookedIn.size() < this.getCapacity();
    }

    public void addGuest(Guest guest) {
        this.bookedIn.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.bookedIn.remove(guest);
    }
}
