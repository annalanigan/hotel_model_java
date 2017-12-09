import People.Guest;
import People.Party;
import Rooms.Bedroom;
import Rooms.MeetingRoom;
import Rooms.PublicRoom;
import org.junit.Before;

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

    }


}
