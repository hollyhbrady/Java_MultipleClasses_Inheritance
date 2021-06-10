import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
    }

//    @Test
//    public void bookingHasBedroom(){
//        assertEquals(bedroom1, hotel.bookRoom());
//    }
}
