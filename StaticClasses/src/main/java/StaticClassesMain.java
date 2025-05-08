import java.util.Scanner;

public class StaticClassesMain {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String userFirstName = myScanner.nextLine();
        System.out.println("Please enter your last name: ");
        String userLastName = myScanner.nextLine();

        System.out.println("Would you like to add your middle name? (y or n): ");
        String userMiddleOption = myScanner.nextLine();

        String userMiddleName = null;
        if (userMiddleOption.equalsIgnoreCase("y")) {
            System.out.println("Enter your middle name: ");
            userMiddleName =myScanner.nextLine();
        }

        System.out.println("Would you like to add a prefix? (y or n): ");
        String userPrefixOption = myScanner.nextLine();

        String userPrefix = null;
        if (userPrefixOption.equalsIgnoreCase("y")) {
            System.out.println("Enter your prefix: ");
            userPrefix = myScanner.nextLine();
        }
        System.out.println("Would you like to add a suffix? (y or n): ");
        String userSuffixOption = myScanner.nextLine();

        String userSuffix = null;
        if (userSuffixOption.equalsIgnoreCase("y")) {
            System.out.println("Enter your suffix: ");
            userSuffix = myScanner.nextLine();
        }

        String userFormattedName = NameFormatter.format(userPrefix, userFirstName, userMiddleName, userLastName, userSuffix);
        System.out.println(userFormattedName);
    }

}
