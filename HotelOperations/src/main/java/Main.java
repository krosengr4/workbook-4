public class Main {

    public static void main(String[] args) {

        //Creating new instance of Reservation object
        Reservation res1 = new Reservation("king", 4, false);
        System.out.println("price per night: " + res1.getPrice() + "\nTotal price: " + res1.getReservationTotal());

        reservationsArray();
        roomAvailability();
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
        System.out.printf("Reservation 1 price per night: $%.2f.\nReservation 1 Total Price: $%.2f \n", reservations[1].getPrice(), reservations[1].getReservationTotal());
    }

    public static void roomAvailability() {
        //Declaring variables for Room variables
        Room r1, r2, r3;
        //Instantiating Room objects
        r1 = new Room(3, 124.99, false, false);
        r2 = new Room(1, 109.99, false, true);
        r3 = new Room(2, 114.99, false, true);

        //Printing out price and availability
        System.out.printf("""
                        Room 1 costs $%.2f per night. The availability is: %b
                        Room 2 costs $%.2f per night. \
                        The availability is: %b
                        Room 3 costs $%.2f per night. The availability is: %b""",
                r1.getPrice(), r1.isAvailable, r2.getPrice(), r2.isAvailable, r3.getPrice(), r3.isAvailable);
    }

}
