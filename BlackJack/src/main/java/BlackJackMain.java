import java.util.Scanner;

public class BlackJackMain {

    public static void main(String[] args) {
        System.out.println("\t\t=====WELCOME TO BLACKJACK!=====");

        String p1 = Utils.promptGetUserInput("Enter the name of the 1st player: ");
        String p2 = Utils.promptGetUserInput("Enter the name of the 2nd player: ");
        System.out.println("\n\t_____" + p1 + "_vs_" + p2 + "_____\n\tClosest To 21 Wins!");
        Utils.pauseApp();
    }

}
