package Rooms;

public class Bedroom extends Room {

    private BedType type;
    private int capacity;
    private double roomRate;

    public Bedroom(String name, BedType type, double roomRate) {
        super(name);
        this.type = type;
        this.capacity = this.type.getValue();
        this.roomRate = roomRate;
    }

    public BedType getType() {
        return type;
    }

    public void setType(BedType type) {
        this.type = type;
        this.capacity = type.getValue();
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(BedType newType) {
        this.capacity = newType.getValue();
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }
}
