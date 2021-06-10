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

}
