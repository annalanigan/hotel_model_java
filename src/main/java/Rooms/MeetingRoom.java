package Rooms;

public class MeetingRoom extends Room{

    private String name;
    private double rate;

    public MeetingRoom(int capacity, String name, double rate) {
        super(capacity);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
