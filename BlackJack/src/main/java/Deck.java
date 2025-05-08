import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck (){
        cards = new ArrayList<>();
        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String suite: suites) {
            for (String value: values) {
                Card card = new Card(suite, value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if(!cards.isEmpty()) {
            return cards.removeFirst();
        } else {
            return null;
        }
    }

    public int getSize() {
        return cards.size();
    }

}
