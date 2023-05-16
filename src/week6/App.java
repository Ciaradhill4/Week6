package week6;


public class App {

	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Jamella");
		Player player2 = new Player("Monique");
		
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player1.hand.add(deck.draw());
			}
			else {
				player2.hand.add(deck.draw());
			}
		}
		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}
			else if(player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			}
			else {
				System.out.println("Draw");
			}
		}
		
		if (player1.score > player2.score) {
			System.out.println("*****************************************\n");

			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");

			System.out.println(player2.name + "'s " + "final score is: "+ player2.score + "\n");

			System.out.println(player1.name + " wins this round! \n");

			System.out.println("*****************************************\n");
		}
		else if(player2.score > player1.score)  {
			System.out.println("*****************************************\n");

			System.out.println(player2.name + "'s " + "final score is: " + player2.score + "\n");

			System.out.println(player1.name + "'s " + "final score is: "+ player1.score + "\n");

			System.out.println(player2.name + " wins this round! \n");

			System.out.println("*****************************************\n");
		}
		if(player1.score == player2.score) {
			
			System.out.println("DRAW!");
			
		}
	}
}
