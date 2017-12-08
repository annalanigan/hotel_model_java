package Rooms;

public class Bedroom extends Room {

    private BedType type;
    private int roomNumber;
    private double roomRate;

    public Bedroom(int capacity, BedType type, int roomNumber, double roomRate) {
        super(capacity);
        this.type = type;
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;
    }

    public BedType getType() {
        return type;
    }

    public void setType(BedType type) {
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }
}
