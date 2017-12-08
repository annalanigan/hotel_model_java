package Rooms;

public enum BedType {
        SINGLE(1, "single"),
        DOUBLE(2, "double"),
        TWIN(2, "twin"),
        FAMILY3(3, "family of three"),
        FAMILY4(4, "family of four"),
        SUPERIOR(2, "superior double");

    private final int capacity;
    private final String output;

    BedType(int value, String output) {
        this.capacity = value;
        this.output = output;
    }

    public int getValue() {
        return this.capacity;
    }

    public String getOutput() {
        return this.output;
    }

}
