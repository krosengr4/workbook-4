public class HotelOperationsMain {

    public static void main(String[] args) {

        reservationsArray();
        roomAvailability();
        checkInOutClean();
        employeeCheckInOut();
        bookHotelRooms();
    }

    public static void reservationsArray() {
        //Creating a new array of Reservation objects, with 4 empty slots
        Reservation[] reservations = new Reservation[4];
        //Filling the reservation array with new instances of Reservation object
        reservations[0] = new Reservation("king", 2, true);
        reservations[1] = new Reservation("double", 3, true);
        reservations[2] = new Reservation("king", 4, false);
        reservations[3] = new Reservation("double", 2, true);
        // Print results
        System.out.printf("Reservation 2 price per night: $%.2f.\nReservation 2 Total Price: $%.2f \n", reservations[1].getPrice(), reservations[1].getReservationTotal());
    }

    public static void roomAvailability() {
        //Declaring variables for Room variables
        Room r1, r2, r3;
        //Instantiating Room objects
        r1 = new Room(3, 124.99, false, false);
        r2 = new Room(1, 109.99, false, true);
        r3 = new Room(2, 114.99, true, true);

        //Printing out price and availability
        System.out.printf("""
                        Room 1 costs $%.2f per night. The availability is: %b
                        Room 2 costs $%.2f per night. \
                        The availability is: %b
                        Room 3 costs $%.2f per night. The availability is: %b""",
                r1.getPrice(), r1.isAvailable(), r2.getPrice(), r2.isAvailable(), r3.getPrice(), r3.isAvailable());
    }

    public static void checkInOutClean() {
        //Creating new instance of Room object
        Room r1 = new Room(3, 124.99, false, false);
        //Printing out if anyone is checked in or out and availability of room
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");

        //Checking a guest into r1
        r1.checkIn();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied);
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");

        //Checking a guest out
        r1.checkOut();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied );
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");

        //Cleaning room
        r1.cleanRoom();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied);
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");
    }

    public static void employeeCheckInOut() {
        //Create new instance of employee
        Employee e1 = new Employee(1, "Roberto", "House Keeping", 22.05);

        e1.punchTimeCard(9.67);
        e1.punchTimeCard(19.50);

        System.out.println(e1.getName() + " started at " + e1.startTime);
        System.out.println(e1.getName() + " ended at " + e1.endTime);
        System.out.println(e1.getName() + " worked " + e1.todayHours + " hours today.");
        System.out.println(e1.getName() + " total hours worked: " + e1.getTotalHours());
    }

    public static void bookHotelRooms () {
        Hotel h1 = new Hotel("Marriot", 5, 20);

        h1.bookRoom(3, false);
        h1.bookRoom(2, true);
        h1.bookRoom(7, false);

        System.out.println("\nThere are now " + h1.getBookedBasicRooms() + " rooms booked and " + h1.getBookedSuites() + " suites booked.");
        System.out.println(h1.getAvailableRooms() + " room(s) available. " + h1.getAvailableSuites() + " suite(s) available.");
    }

}
