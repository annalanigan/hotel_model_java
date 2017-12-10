import People.Guest;
import People.Party;
import Rooms.BedRooms;
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

    //First list rooms method - I have kept this to demonstrate some tests
    public String showListRooms(){
        ArrayList<String> names = new ArrayList<>();
        for (Bedroom room : bedrooms) {
            names.add(room.showDetails());
        }
        return names.toString();
    }
    // Second List Room Method!
    public void showListRooms2(){
        for (Bedroom room : bedrooms) {
            System.out.println(room.showDetails());
        }
    }

    //First list available rooms method - I have kept this to demonstrate some tests
    public String showAvailRooms(){
        ArrayList<String> names = new ArrayList<>();
        for (Bedroom room : bedrooms) {
            if (room.checkCheckedIn() == 0){
            names.add(room.showDetails());
            }
        }
        return names.toString();
    }
    // Second available List Room Method!
    public void showAvailRooms2(){
        for (Bedroom room : bedrooms) {
            if (room.checkCheckedIn() == 0) {
                System.out.println(room.showDetails());
            }
        }
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addBedrooms(){
        for (BedRooms room : BedRooms.values()) {
            Bedroom aRoom = new Bedroom(room);
            this.bedrooms.add(aRoom);
        }
    }

    public int getNoOfBedrooms(){
        return bedrooms.size();
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

    // my firstcheck in method using the actual Bedroom object as an arguement:
    public void checkInBed(Guest guest, Bedroom bedroom, int duration) {
        if (bedroom.checkCheckedIn() == 0){
            bedroom.checkIn(guest);
            guest.addToBill(bedroom.getRoomRate()* duration);
        }
        else if (bedroom.getCapacity() > bedroom.checkCheckedIn()) {
            bedroom.checkIn(guest);
        }
    }

    // using index number to find the bedroom from the ArrayList
    public void checkInBed2(Guest guest, int index, int duration) {
        Bedroom bedroom = bedrooms.get(index);
        checkInBed(guest, bedroom, duration);
    }

    // using room "name" to find the bedroom from ArrayList
    public void checkInBed3(Guest guest, String name, int duration){
        for (Bedroom bedroom : bedrooms){
            if (bedroom.getName() == name){
            checkInBed(guest, bedroom, duration);
            }
        }
    }

    public Bedroom getBedroomObject(String roomName) {
        Bedroom newObject = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getName() == name) {
                newObject = bedroom;
            }
        }
        return newObject;
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
