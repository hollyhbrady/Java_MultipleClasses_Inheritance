import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestList;

    public Room(){
        this.guestList = new ArrayList<>();
    }

    public ArrayList getGuestList() {
        return this.guestList;
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public int getNumberOfGuests(){
        return this.guestList.size();
    }
}