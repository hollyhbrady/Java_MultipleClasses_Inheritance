import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(250, booking1.getTotalBill());
    }

    @Test
    public void canChangeRoomRate(){
        bedroom1.setRoomRate(100);
        assertEquals(100, bedroom1.getRoomRate());
    }
}
