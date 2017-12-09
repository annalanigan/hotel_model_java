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

    public void addBedrooms(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public ArrayList<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void addMeetingRooms(MeetingRoom meetingRoom) {
        this.meetingRooms.add(meetingRoom);
    }

    public ArrayList<PublicRoom> getPublicRooms() {
        return publicRooms;
    }

    public void addPublicRooms(PublicRoom publicRoom) {
        this.publicRooms.add(publicRoom);
    }

    public void checkInBed(Guest guest, Bedroom bedroom) {
        if (bedroom.checkCheckedIn() == 0){
            bedroom.checkIn(guest);
            guest.addToBill(bedroom.getRoomRate());
        }
        else if (bedroom.getCapacity() > bedroom.checkCheckedIn()) {
            bedroom.checkIn(guest);
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
