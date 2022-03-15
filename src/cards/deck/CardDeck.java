package cards.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import cards.card.Card;

/**
 * Represents a generic deck of cards of no specific size or content
 * 
 * @author emilynavarro
 *
 */
public abstract class CardDeck {

	private Stack<Card> cards;

	protected CardDeck() {
		cards = new Stack<>();
	}


	/**
	 * Adds a card to this deck at an undetermined position
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
	
	
	public Card draw() {
		return cards.pop();
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