import Rooms.BedType;
import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    Bedroom bedroom6;

    @Before
    public void before(){
        bedroom1 = new Bedroom("102", BedType.DOUBLE, 105.00);
        bedroom2 = new Bedroom("102", BedType.SINGLE, 98.00);
        bedroom3 = new Bedroom("102", BedType.FAMILY3, 120.00);
        bedroom4 = new Bedroom("102", BedType.SUPERIOR, 250.00);
        bedroom5 = new Bedroom("102", BedType.TWIN, 105.00);
        bedroom6 = new Bedroom("102", BedType.FAMILY4, 150.00);
    }

    @Test
    public void roomHasCapcity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void roomHasCapacityCheck2(){
        assertEquals(4, bedroom6.getCapacity());
    }

}
