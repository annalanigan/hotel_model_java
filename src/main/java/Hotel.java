import Rooms.Bedroom;
import Rooms.MeetingRoom;
import Rooms.PublicRoom;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Rooms.Bedroom> bedrooms;
    private ArrayList<Rooms.MeetingRoom> meetingRooms;
    private ArrayList<Rooms.PublicRoom> publicRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.meetingRooms = new ArrayList<>();
        this.publicRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(ArrayList<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public ArrayList<PublicRoom> getPublicRooms() {
        return publicRooms;
    }

    public void setPublicRooms(ArrayList<PublicRoom> publicRooms) {
        this.publicRooms = publicRooms;
    }

    // Check in methods

    // check out methods

}
