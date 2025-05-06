import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

//        reservationsArray();
//        roomAvailability();
        checkInOutClean();
        employeeCheckInOut();
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
        Room r1 = new Room(3, 124.99, false, false);
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");


        r1.checkIn();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied);
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");



        r1.checkOut();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied );
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");

        r1.cleanRoom();
        System.out.println("The guest is checked in: " + r1.isCheckedIn());
        System.out.println("The guest has checked out?: " + r1.isCheckedOut());
        System.out.println("The room is occupied?: " + r1.isOccupied);
        System.out.println("Room 1 is available?: " + r1.isAvailable() + "\n");
    }

    public static void employeeCheckInOut() {
        Employee e1 = new Employee(0001, "Roberto", "House Keeping", 22.05);

        double timeStarted = e1.punchIn(10.67);
        System.out.println(e1.getName() + " Started at: " + timeStarted);

        double timeEnded = e1.punchOut(16.50);
        System.out.println( e1.getName() + " Ended at: " + timeEnded);

        double totalTimeWorked = e1.punchTimeCard(10.67, 16.50);
        System.out.println(e1.getName() + " worked " + totalTimeWorked + " hours");

    }

}
