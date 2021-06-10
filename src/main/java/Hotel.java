import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> confRoomList;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.confRoomList = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.confRoomList.add(conferenceRoom);
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
}
