package blackjack;

import java.util.ArrayList;
import java.util.List;

import cards.card.Card;

/**
 * Represents a player in blackjack
 * 
 * @author emilynavarro
 *
 */
public class Player {

	private String name;
	private List<Card> hand;

	private Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
	}


	/**
	 * Static factory method
	 * 
	 * @param name name of the player
	 * 
	 * @return new player
	 */
	public static Player createPlayer(String name) {
		return new Player(name);
	}
	
	
	public String getName() {
		return name;
	}
	
	
	/**
	 * Returns a list of cards in the player's hand
	 * 
	 * @return list of cards in the player's hand
	 */
	public List<Card> getHand() {
		return new ArrayList<>(hand);
	}
	
	
	/**
	 * Adds a card to the player's hand
	 * 
	 * @param c	the card to add
	 */
	public void addCardToHand(Card c) {
		hand.add(c);
	}

}