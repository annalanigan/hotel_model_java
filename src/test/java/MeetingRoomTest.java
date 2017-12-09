import People.Guest;
import People.Party;
import Rooms.MeetingRoom;
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
        meetingRoom1 = new MeetingRoom("Bentley Suite", 150, 1500);
        meetingRoom2 = new MeetingRoom("Jackson Room", 50, 540);
        meetingRoom3 = new MeetingRoom("Taylor Room", 25, 300);
        meetingRoom4 = new MeetingRoom("Simpsons Suite", 450, 3000);
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


}
