package Rooms;

import People.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedType type;
    private double roomRate;
    private ArrayList<Guest> checkedIn;

    public Bedroom(String name, BedType type, double roomRate) {
        super(name, type.getValue());
        this.type = type;
        this.roomRate = roomRate;
        this.checkedIn = new ArrayList<>();
    }

    public BedType getType() {
        return type;
    }

    public void setType(BedType type) {
        this.type = type;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public ArrayList<Guest> getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(ArrayList<Guest> checkedIn) {
        this.checkedIn = checkedIn;
    }
}
