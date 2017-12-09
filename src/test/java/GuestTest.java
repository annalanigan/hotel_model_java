import People.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Betty Boop");
        guest2 = new Guest("Tony Balucci");
    }

    @Test
    public void canAddToBill(){
        guest1.addToBill(100);
        assertEquals(100, guest1.getBill(), 0.01);
    }

}
