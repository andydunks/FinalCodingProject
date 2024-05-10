import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        //Creates New Deck Which Has 4 Suits And 14 Values For Each Suit
        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                String name;
                switch (value) {
                    case 11:
                        name = "Jack";
                        break;
                    case 12:
                        name = "Queen";
                        break;
                    case 13:
                        name = "King";
                        break;
                    case 14:
                        name = "Ace";
                        break;
                    default:
                        name = String.valueOf(value);
                        break;
                }
                cards.add(new Card(value, name + " of " + suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}