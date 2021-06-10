public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber){
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;

    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }


}
