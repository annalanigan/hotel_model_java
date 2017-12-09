import People.Guest;
import Rooms.BedRooms;
import Rooms.BedType;
import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Bedroom bedroom6;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        bedroom1 = new Bedroom(BedRooms.ONEZERO);
        bedroom2 = new Bedroom(BedRooms.ONEONE);
        bedroom3 = new Bedroom(BedRooms.ONEFOUR);
        bedroom4 = new Bedroom(BedRooms.THREEZERO);
        bedroom5 = new Bedroom(BedRooms.ONEEIGHT);
        bedroom6 = new Bedroom(BedRooms.ONEFIVE);
        guest1 = new Guest("Betty");
        guest2 = new Guest("Simon");
        guest3 = new Guest("Bill");
    }

    @Test
    public void roomHasCapcity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void roomHasCapacityCheck2(){
        assertEquals(4, bedroom6.getCapacity());
    }

    @Test
    public void roomHasRate(){
        assertEquals(105.00, bedroom1.getRoomRate(), 0.01);
    }

    @Test
    public void canChecIn(){
        bedroom1.checkIn(guest1);
        assertEquals(1, bedroom1.checkCheckedIn());
    }

    @Test
    public void canCheckGuestInRoom(){
        bedroom5.checkIn(guest3);
        assertEquals("[Bill]", bedroom5.guestName());
    }

    @Test
    public void canCheckGuestsInRoom(){
        bedroom3.checkIn(guest3);
        bedroom3.checkIn(guest2);
        bedroom3.checkIn(guest1);
        assertEquals("[Bill, Simon, Betty]", bedroom3.guestName());
    }

}
