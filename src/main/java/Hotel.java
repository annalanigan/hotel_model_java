import People.Guest;
import People.Party;
import Rooms.Bedroom;
import Rooms.MeetingRoom;
import Rooms.PublicRoom;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<MeetingRoom> meetingRooms;
    private ArrayList<PublicRoom> publicRooms;

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


    public void checkInBed(Guest guest1, Bedroom bedroom1) {
        if (bedroom1.checkCheckedIn() == 0){
            bedroom1.checkIn(guest1);
            guest1.addToBill(bedroom1.getRoomRate());
        }
        else if (bedroom1.getCapacity() > bedroom1.checkCheckedIn()) {
            bedroom1.checkIn(guest1);
        }
    }

    public void checkOutBed(Bedroom bedroom){
        bedroom.checkOut();
    }

    public void checkInMeeting(Party party, MeetingRoom meeting) {
        meeting.checkInParty(party);
    }

    public void checkOutMeeting(MeetingRoom meeting) {
        meeting.checkOutParty();
    }
}
