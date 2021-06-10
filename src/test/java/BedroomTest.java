import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
        guest = new Guest("Clive");
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

}
