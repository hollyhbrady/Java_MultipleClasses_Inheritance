import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> confRoomList;
    private HashMap<String, DiningRoom> diningRoomList;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.confRoomList = new ArrayList<>();
        this.diningRoomList = new HashMap<>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.confRoomList.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRoomList.put(diningRoom.getRoomName(), diningRoom);
    }

    public HashMap getDiningRooms() {
        return this.diningRoomList;
    }

    public int getNumberOfBedrooms() {
        return this.bedroomList.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.confRoomList.size();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void removeGuestFromBedroom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }

    public int getNumberOfGuestsBedroom(Bedroom bedroom) {
        return bedroom.getNumberOfGuests();
    }

    public int getNumberOfGuestsConf(ConferenceRoom conferenceRoom) {
        return conferenceRoom.getNumberOfGuests();
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking booking;
        booking = new Booking(bedroom, numberOfNights);
        return booking;
    }

    public int getNightsBooked(Booking booking) {
        return booking.getNightsBooked();
    }

    public Bedroom getRoomBooked(Booking booking) {
        return booking.getRoomBooked();
    }

}
