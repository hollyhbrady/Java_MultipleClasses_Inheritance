import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    ConferenceRoom confRoom1;
    ConferenceRoom confRoom2;

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> confRoomList;

    Hotel hotel;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
        bedroom2 = new Bedroom(RoomType.SINGLE, 2);
        bedroom3 = new Bedroom(RoomType.FAMILY, 3);

        confRoom1 = new ConferenceRoom("Lovely Room", 20);
        confRoom2 = new ConferenceRoom("The Smoking Room", 30);

        bedroomList = new ArrayList<>();

        confRoomList = new ArrayList<>();

        hotel = new Hotel("The Royal Duck");
    }

    @Test
    public void bedRoomListStartsEmpty(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.getNumberOfBedrooms());
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddConfRoom(){
        hotel.addConferenceRoom(confRoom1);
        hotel.addConferenceRoom(confRoom2);
        assertEquals(2, hotel.getNumberOfConferenceRooms());
    }
}