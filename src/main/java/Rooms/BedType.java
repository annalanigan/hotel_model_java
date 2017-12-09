package Rooms;

public enum BedType {
        SINGLE(1, 98.00, "single"),
        DOUBLE(2, 105.00, "double"),
        TWIN(2, 105.00, "twin"),
        FAMILY3(3, 120.00, "family of three"),
        FAMILY4(4, 125.00, "family of four"),
        SUPERIOR(2, 250.00, "superior double");

    private final int capacity;
    private final double rate;
    private final String output;

    BedType(int value, double rate ,String output) {
        this.capacity = value;
        this.rate = rate;
        this.output = output;
    }

    public int getValue() {
        return this.capacity;
    }

    public String getPretty() {
        return this.output;
    }

    public double getRate() {
        return rate;
    }
}
