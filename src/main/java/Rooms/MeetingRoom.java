package Rooms;

public class MeetingRoom extends Room{

    private int capacity;
    private double rate;

    public MeetingRoom(String name, int capacity, double rate) {
        super(name);
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
