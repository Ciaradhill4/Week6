package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	
	
	Player(String name){
		this.name = name;
		this.score = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		
		int i = 1;
		
		System.out.println("-----------------");
		
		System.out.println("Player Name: " + name + "==" + 
		"Score: " + score);
		
		System.out.println("-----------------");
		
		for (Card card : hand) {
			System.out.println(i);
			card.describe();
			i++;
		}
	}
	
	public Card flip() {
		Card card = hand.remove(0);
		return card;
	}
	
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	public void incrementScore() {
		score++;
	}
	
	
}
