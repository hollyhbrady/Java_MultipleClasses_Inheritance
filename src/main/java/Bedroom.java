public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;
    private int nightlyRate;

    public Bedroom(RoomType roomType, int roomNumber){
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = 50;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomRate(int rate){
        this.nightlyRate = rate;
    }

    public int getRoomRate(){
        return this.nightlyRate;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }


}
