import People.Guest;
import People.Party;
import Rooms.MeetingRoom;
import Rooms.MeetingType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MeetingRoomTest {

    MeetingRoom meetingRoom1;
    MeetingRoom meetingRoom2;
    MeetingRoom meetingRoom3;
    MeetingRoom meetingRoom4;
    Guest guest1;
    Guest guest2;
    Party party1;
    Party party2;

    @Before
    public void before(){
        meetingRoom1 = new MeetingRoom(MeetingType.BENTLEYSUITE);
        meetingRoom2 = new MeetingRoom(MeetingType.THEORANGERY);
        meetingRoom3 = new MeetingRoom(MeetingType.RAEBURNROOM);
        meetingRoom4 = new MeetingRoom(MeetingType.THESIMPSONSUITE);
        guest1 = new Guest("Mr John Jones");
        guest2 = new Guest("Miss Sarah Sharp");
        party1 = new Party(guest1, 100);
        party2 = new Party(guest2, 40);
    }

    @Test
    public void canAddParty(){
        meetingRoom4.checkInParty(party1);
        assertEquals(party1, meetingRoom4.getParty());
    }

    @Test
    public void cantAddLargeParty(){
        meetingRoom3.checkInParty(party2);
        assertEquals(null, meetingRoom3.getParty());
    }

    @Test
    public void cantAddPartyIfOccupied(){
        meetingRoom2.checkInParty(party2);
        assertEquals(false, meetingRoom2.checkAvailable());
    }


}
