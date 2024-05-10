import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<>();;
    private int score;
    private String name;

    public Player(String name) {
        this.score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println("Player " + name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}



