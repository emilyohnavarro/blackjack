package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a generic deck of cards of no specific size or content
 * 
 * @author emilynavarro
 *
 */
public abstract class CardDeck {

	private List<Card> cards;

	protected CardDeck() {
		cards = new ArrayList<>();
	}


	/**
	 * Adds a card to this deck
	 * 
	 * @param c	the card to add
	 */
	protected void addCard(Card c) {
		cards.add(c);
	}
	
	
	public List<Card> getCards() {
		return new ArrayList<>(cards);
	}
	
	
	/**
	 * Re-orders the cards into a random order
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	@Override	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Card c : cards) {
			result.append(c);
			result.append('\n');
		}
		return result.toString();
	}

}