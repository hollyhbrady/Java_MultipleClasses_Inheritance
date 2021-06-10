import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom confRoom;
    Guest guest;

    @Before
    public void before(){
    confRoom = new ConferenceRoom("Meeting Room", 20);
    guest = new Guest("Clarence");
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Meeting Room", confRoom.getRoomName());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, confRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuests() {
        confRoom.addGuest(guest);
        assertEquals(1, confRoom.getNumberOfGuests());
    }

}
