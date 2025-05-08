import java.util.Scanner;

public class BlackJackMain {

    public static void main(String[] args) {
        System.out.println("\t\t=====WELCOME TO BLACKJACK!=====");

        String p1 = Utils.promptGetUserInput("Enter the name of the 1st player: ");
        String p2 = Utils.promptGetUserInput("Enter the name of the 2nd player: ");
        System.out.println("\n\t_____" + p1 + "_vs_" + p2 + "_____\n\tClosest To 21 Wins!");
        Utils.pauseApp();

        Deck deck = new Deck();
        deck.shuffle();

        int p1TotalGamesWon = 0;
        int p2TotalGamesWon = 0;

        boolean ifContinue = true;

        while(ifContinue) {

            Hand p1Hand = dealFirstPlayer(deck);
            Hand p2Hand = dealSecondPlayer(deck);

            System.out.println(p1 + " has " + p1Hand.getValue());
            System.out.println(p2 + " has " + p2Hand.getValue());

            if (p1Hand.getValue() > 21 && p2Hand.getValue() <= 21) {
                System.out.println(p2 + " wins!");
                p2TotalGamesWon++;
                System.out.println(p1TotalGamesWon + " - " + p2TotalGamesWon);
                Utils.pauseApp();
            } else if (p2Hand.getValue() > 21 && p1Hand.getValue() <= 21) {
                System.out.println(p1 + " wins!");
                p1TotalGamesWon++;
                System.out.println(p1TotalGamesWon + " - " + p2TotalGamesWon);
                Utils.pauseApp();
            } else if (p1Hand.getValue() > p2Hand.getValue() && p1Hand.getValue() <= 21) {
                System.out.println(p1 + " wins!");
                p1TotalGamesWon++;
                System.out.println(p1TotalGamesWon + " - " + p2TotalGamesWon);
                Utils.pauseApp();
            } else if (p1Hand.getValue() < p2Hand.getValue() && p2Hand.getValue() <= 21) {
                System.out.println(p2 + " wins!");
                p2TotalGamesWon++;
                System.out.println(p1TotalGamesWon + " - " + p2TotalGamesWon);

                Utils.pauseApp();
            } else if (p1Hand.getValue() <= 21 && p2Hand.getValue() <= 21 && p1Hand.getValue() == p2Hand.getValue()) {
                System.out.println("It is a draw!");
                System.out.println(p1TotalGamesWon + " - " + p2TotalGamesWon);
                Utils.pauseApp();
            }

            String playAgain = Utils.promptGetUserInput("Would you like to play another hand? (y or n): ");

            if (playAgain.equalsIgnoreCase("n")) {

                if (p1TotalGamesWon > p2TotalGamesWon) {
                    System.out.printf("%s has defeated %s %d - %d", p1, p2, p1TotalGamesWon, p2TotalGamesWon);
                } else if (p1TotalGamesWon < p2TotalGamesWon) {
                    System.out.printf("%s has defeated %s %d - %d", p2, p1, p2TotalGamesWon, p1TotalGamesWon);
                } else {
                    System.out.println("We will never know who is superior.");
                }
                System.out.println("\n---Thanks for playing!---");
                ifContinue = false;
            }
        }
    }

    public static Hand dealFirstPlayer(Deck deck) {
        Hand p1Hand = new Hand();

        for (int i = 0; i < 2; i++) {
            Card card = deck.deal();
            p1Hand.deal(card);
        }
        return p1Hand;
    }

    public static Hand dealSecondPlayer (Deck deck) {
        Hand p2Hand = new Hand();

        for (int i = 0; i < 2; i++) {
            Card card = deck.deal();
            p2Hand.deal(card);
        }
        return p2Hand;
    }

}
