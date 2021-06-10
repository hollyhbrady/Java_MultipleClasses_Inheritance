import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    ConferenceRoom confRoom1;
    ConferenceRoom confRoom2;

    DiningRoom diningRoom;

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> confRoomList;

    Hotel hotel;

    @Before
    public void before(){

        guest1 = new Guest("Dan");
        guest2 = new Guest("Holly");
        guest3 = new Guest("Hannah");
        guest4 = new Guest("Colin");

        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
        bedroom2 = new Bedroom(RoomType.SINGLE, 2);
        bedroom3 = new Bedroom(RoomType.FAMILY, 3);

        confRoom1 = new ConferenceRoom("Lovely Room", 20);
        confRoom2 = new ConferenceRoom("The Smoking Room", 30);

        diningRoom = new DiningRoom("The Big Dining Room", 40);

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

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(bedroom1, guest1);
        assertEquals(1, hotel.getNumberOfGuestsBedroom(bedroom1));
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(confRoom1, guest2);
        hotel.checkInGuestToConferenceRoom(confRoom1, guest3);
        assertEquals(2, hotel.getNumberOfGuestsConf(confRoom1));
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.checkInGuestToBedroom(bedroom1, guest1);
        hotel.removeGuestFromBedroom(bedroom1, guest1);
        assertEquals(0, hotel.getNumberOfGuestsBedroom(bedroom1));
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(confRoom1, guest2);
        hotel.removeGuestFromConferenceRoom(confRoom1, guest2);
        assertEquals(0, hotel.getNumberOfGuestsConf(confRoom1));
    }

    @Test
    public void canAddBooking(){
        Booking returnedBooking;
        returnedBooking = hotel.bookRoom(bedroom1, 5);
        assertEquals(5, hotel.getNightsBooked(returnedBooking));
        assertEquals(bedroom1, hotel.getRoomBooked(returnedBooking));
    }

    @Test
    public void canAddDiningRoom(){
//        DiningRoom returnedDiningRoom;
        hotel.addDiningRoom(diningRoom);
//        assertEquals(true, hotel.getDiningRooms().containsKey("The Big Dining Room"));
//        assertEquals(true, hotel.getDiningRooms().containsValue(diningRoom));
        assertEquals(diningRoom, hotel.getDiningRooms().get("The Big Dining Room"));
//        returnedDiningRoom = hotel.getDiningRooms().get("The Big Dining Room");
//        assertEquals(40, returnedDiningRoom.getDiningCapacity());
    }


}

// {"The Big Dining Room": diningRoom1, "KITCHEN!!": diningRoom2}
// diningRoom1
// name: "The Big Dining Room"
// capacity: 30
// diningRoom2
// name: "KITCHEN!!"
// capacity: 4