package Rooms;

public class PublicRoom extends Room{

    private int capacity;
    private String type;

    public PublicRoom(String name, int capacity, String type) {
        super(name);
        this.capacity = capacity;
        this.type = type;
    }

    public int capacity() {
        return capacity;
    }

    public void setName(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
