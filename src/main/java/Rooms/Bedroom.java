package Rooms;

import People.Guest;
import java.util.ArrayList;

public class Bedroom extends Room {

    private BedType type;
    private double roomRate;
    private ArrayList<Guest> checkedIn;

    public Bedroom(BedRooms bedRoom) {
        super(bedRoom.getPretty(), bedRoom.getType().getValue());
        this.type = bedRoom.getType();
        this.roomRate = bedRoom.getType().getRate();
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

    public Guest getCheckedIn() {
        return checkedIn.get(0);
    }

    public int checkCheckedIn(){
        return checkedIn.size();
    }

    public void checkIn(Guest guest) {
        this.checkedIn.add(guest);
    }

    public boolean checkAvailable(){
        return this.checkCheckedIn() < this.getCapacity();
    }

    public void checkOut(){
        this.checkedIn.clear();
    }

    public double checkBillofGuest(){
        return checkedIn.get(0).getBill();
    }

    public String guestName() {
        ArrayList<String> result = new ArrayList<>();
        for (Guest each : checkedIn ) {
           result.add(each.getName());
        }
        return result.toString();
    }

    public String showDetails() {
        return getName() + ": " + type.getPretty();
    }
}
