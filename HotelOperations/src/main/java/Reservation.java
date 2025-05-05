public class Reservation {

    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public Reservation (String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //region getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if(!roomType.equals("king") && !roomType.equals("double")) {
            throw new RuntimeException("ERROR! Invalid room type!");
        }

        this.roomType = roomType;
    }

    public double getPrice() {
        if(this.roomType.equals("king")){
            this.price = 139.00;
        } else if(this.roomType.equals("double")) {
            this.price = 124.00;
        } else {
            throw new RuntimeException("ERROR! Invalid room type!");
        }

        if(this.isWeekend){
            this.price += (.1 * this.price);
        }

        return this.price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal = this.price * this.numberOfNights;
    }

}
