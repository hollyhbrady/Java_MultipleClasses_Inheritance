public class ConferenceRoom extends Room {

    private String roomName;
    private int capacity;

    public ConferenceRoom(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public String getRoomName(){
        return this.roomName;
    }


}
