public class Hotel {

    String name;
    int numberOfSuites;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        bookedSuites = 0;
        bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Method for user to book room(s)
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        boolean ableToBook = false;

        if (!isSuite && (numberOfRooms <= this.numberOfRooms - this.bookedBasicRooms)) {
            this.bookedBasicRooms += numberOfRooms;
            ableToBook = true;

            System.out.println("Success! "+ numberOfRooms + " rooms were booked!");
        } else if (isSuite && (numberOfRooms <= this.numberOfSuites - this.bookedSuites)) {
            this.bookedSuites += numberOfRooms;
            ableToBook = true;

            System.out.println("Success! "+ numberOfRooms + " suites were booked!");
        } else {
            System.err.println("We're sorry, we do not have that many rooms available.");
        }

        return ableToBook;
    }

    public int getAvailableSuites() {
        return numberOfSuites - getBookedSuites();
    }

    public int getAvailableRooms() {
        return numberOfRooms - getBookedBasicRooms();
    }


    //region setters and getters
    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    //endregion


}
