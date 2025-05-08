public class Card {

    String suit;
    String value;
    boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if (isFaceUp) {
            //String value of card (A, K, Q, J, 10, 9...)
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        int pointValue = 0;

        if (isFaceUp) {
            switch (value) {
                case "A" -> pointValue = 11;
                case "K", "Q", "J", "10" -> pointValue = 10;
                case "9" -> pointValue = 9;
                case "8" -> pointValue = 8;
                case "7" -> pointValue = 7;
                case "6" -> pointValue = 6;
                case "5" -> pointValue = 5;
                case "4" -> pointValue = 4;
                case "3" -> pointValue = 3;
                case "2" -> pointValue = 2;
            }
        }
        return pointValue;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

}
