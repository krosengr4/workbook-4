import java.util.Scanner;

public class Utils {

    static Scanner myScanner = new Scanner(System.in);

    //prompt user, then get and return user input
    static String promptGetUserInput(String message) {
        System.out.println(message);
        String userInput = myScanner.nextLine();
        return userInput.trim();
    }

    //Pauses the app until user hits Enter
    public static void pauseApp() {
        System.out.println("\nPress Enter to Continue...");
        myScanner.nextLine();
    }

}
