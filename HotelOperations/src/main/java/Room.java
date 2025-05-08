public class Room {

    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean checkIn;
    boolean checkOut;

    //Constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //region getters and setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }
    //endregion

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean checkIn() {
        if (!this.isDirty && !this.isOccupied) {
            setDirty(true);
            setOccupied(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean isCheckedIn() {
        return this.checkIn;
    }

    public boolean checkOut() {
        if (this.isOccupied) {
            checkIn = false;
            checkOut = true;
            setOccupied(false);
            return true;
        } else {
            return false;
        }
    }

    public boolean isCheckedOut() {
        return checkOut;
    }

    public boolean cleanRoom() {
        if (!this.isOccupied && this.isDirty) {
            setDirty(false);
            return true;
        } else {
            return false;
        }
    }
}
