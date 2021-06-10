public class DiningRoom extends Room {

    private String roomName;
    private int capacity;

    public DiningRoom(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public String getRoomName(){
        return this.roomName;
    }

    public int getDiningCapacity(){
        return this.capacity;
    }

}
