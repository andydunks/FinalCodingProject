public class App {
    public static void main(String[] args) {
    	//Instantiate Deck
        Deck deck = new Deck();
        
        //Shuffle Deck
        deck.shuffle();
        
        //Create 2 Player Objects
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        //Fill Each Players Hands
        for (int i = 0; i < 52; i++) {
        	if(i%2==0) {
        		player1.draw(deck);
        	}else {
        		player2.draw(deck);
        	}
        }

       //Create a Temporary Card For Each Player and Compare, Repeat 26 Times
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            System.out.println("Player 1's card: " + card1.getName());
            System.out.println("Player 2's card: " + card2.getName());
            
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins the hand!");
                System.out.println("--------------------------------");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins the hand!");
                System.out.println("--------------------------------");
            } else {
                System.out.println("No Point Awarded");
                System.out.println("--------------------------------");
            }
        }

        //Show Final Scores and the Winner
        System.out.println("***Final Scores***");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins!");
            
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins!");
            
        } else {
            System.out.println("No one Wins, It is a draw.");
            
        }
    }
}
    