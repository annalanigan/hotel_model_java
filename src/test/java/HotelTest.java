import People.Guest;
import People.Party;
import Rooms.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel myHotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Party party1;
    Party party2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    MeetingRoom meeting1;
    MeetingRoom meeting2;
    PublicRoom publicRoom1;

    @Before
    public void before() {
        myHotel = new Hotel("The Manor");
        guest1 = new Guest("Lady Smee");
        guest2 = new Guest("Peter Hills");
        guest3 = new Guest("Henry Jeffery");
        party1 = new Party(guest2, 15);
        party2 = new Party(guest3, 150);
        bedroom1 = new Bedroom("103", BedType.SUPERIOR);
        bedroom2 = new Bedroom("33", BedType.DOUBLE);
        meeting1 = new MeetingRoom(MeetingType.THESIMPSONSUITE);
        meeting2 = new MeetingRoom(MeetingType.RAEBURNROOM);
        publicRoom1 = new PublicRoom("Ricks Restaurant", 100, "Dining Room");
    }

    @Test
    public void canCheckIn__Bedroom(){
        myHotel.checkInBed(guest1, bedroom1);
        myHotel.checkInBed(guest2, bedroom1);
        myHotel.checkInBed(guest3, bedroom1);
        assertEquals(2, bedroom1.checkCheckedIn());
        assertEquals(250.00, guest1.getBill(), 0.01);
        assertEquals(0, guest2.getBill(), 0.01);
    }

}
