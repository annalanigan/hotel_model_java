package Rooms;

public class PublicRoom extends Room{

    private String name;
    private String type;

    public PublicRoom(int capacity, String name, String type) {
        super(capacity);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
