package Rooms;

public enum MeetingType {

    BENTLEYSUITE(150, 1500.00, "Bentley Suite"),
    TORRIDONROOM(40, 450.00, "Torridon Room"),
    RAEBURNROOM(26, 350.00, "Raeburn Room"),
    THEORANGERY(80, 600.00, "The Orangery"),
    THESIMPSONSUITE(400, 3000.00, "The Simpson Suite");

    private final int capacity;
    private final double rate;
    private final String name;

    MeetingType(int capacity, double rate, String name){
        this.capacity = capacity;
        this.rate = rate;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }

    public String getPretty() {
        return name;
    }
}
