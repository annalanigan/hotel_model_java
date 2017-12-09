package Rooms;

public enum BedRooms {
    ONEZERO("10", BedType.DOUBLE),
    ONEONE("11", BedType.SINGLE),
    ONETWO("12", BedType.SINGLE),
    ONETHREE("13", BedType.SINGLE),
    ONEFOUR("14", BedType.FAMILY3),
    ONEFIVE("15", BedType.FAMILY4),
    ONESIX("16", BedType.SINGLE),
    ONESEVEN("17", BedType.TWIN),
    ONEEIGHT("18", BedType.TWIN),
    ONENINE("19", BedType.DOUBLE),
    TWOZERO("20", BedType.SINGLE),
    TWOONE("21", BedType.DOUBLE),
    TWOTWO("22", BedType.DOUBLE),
    TWOTHREE("23", BedType.DOUBLE),
    TWOFOUR("24", BedType.TWIN),
    TWOFIVE("25", BedType.TWIN),
    TWOSIX("26", BedType.FAMILY4),
    TWOSEVEN("27", BedType.FAMILY3),
    TWOEIGHT("28", BedType.FAMILY4),
    TWONINE("29", BedType.SUPERIOR),
    THREEZERO("30", BedType.SUPERIOR),
    ;

    private final String name;
    private final BedType type;

    BedRooms(String name, BedType type){
        this.name = name;
        this.type = type;
    }

    public String getPretty() {
        return name;
    }

    public BedType getType() {
        return type;
    }
}
