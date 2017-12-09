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

    @Before
    public void before(){
        bedroom1 = new Bedroom("102", BedType.DOUBLE);
        bedroom2 = new Bedroom("102", BedType.SINGLE);
        bedroom3 = new Bedroom("102", BedType.FAMILY3);
        bedroom4 = new Bedroom("102", BedType.SUPERIOR);
        bedroom5 = new Bedroom("102", BedType.TWIN);
        bedroom6 = new Bedroom("102", BedType.FAMILY4);
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

}
