public class Main {

    public static void main(String[] args) {

        Reservation res1 = new Reservation("king", 4, false);

        System.out.println("price per night: " + res1.getPrice() + "\nTotal price: " + res1.getReservationTotal());

    }
}
