import People.Guest;
import Rooms.PublicRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicRoomTest {

    PublicRoom public1;
    PublicRoom public2;
    PublicRoom publictest;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        public1 = new PublicRoom("Robertsons", 100, "Bar");
        public2 = new PublicRoom("Howies", 60, "Restaurant");
        publictest = new PublicRoom("Test Size", 1, "Cupboard!");
        guest1 = new Guest("Wanda Waters");
        guest2 = new Guest("Trina Peterson");
    }

    @Test
    public void canAddGuest(){
        public1.addGuest(guest1);
        assertEquals(1, public1.getInhouse());
    }

    @Test
    public void canRemoveGuest(){
        public2.addGuest(guest2);
        public2.addGuest(guest1);
        public2.removeGuest(guest2);
        assertEquals(1, public2.getInhouse());
    }

    @Test
    public void canCheckAvailable(){
        publictest.addGuest(guest1);
        assertEquals(false, publictest.checkAvailable());
    }
}
