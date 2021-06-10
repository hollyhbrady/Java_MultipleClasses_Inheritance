public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public int getNightsBooked(){
        return this.nightsBooked;
    }

    public Bedroom getRoomBooked() {
        return this.bedroom;
    }

    public int getTotalBill() {
        return this.bedroom.getRoomRate() * this.nightsBooked;
    }

}
