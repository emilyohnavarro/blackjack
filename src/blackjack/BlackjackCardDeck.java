package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import cards.card.NonNumericalCard;
import cards.card.Suit;

/**
 * Represents a deck of cards to use for blackjack
 * 
 * @author emilynavarro
 *
 */
public class BlackjackCardDeck {

	private Stack<BlackjackCard> cards;

	private BlackjackCardDeck() {
		cards = new Stack<>();
	}

	
	public static BlackjackCardDeck createBlackjackCardDeck(int numDecks) {
		BlackjackCardDeck deck = new BlackjackCardDeck();
		for (Suit suit : Suit.values()) {

			// generate numerical cards:
			for (int i = 2; i <= 10; i++) {
				deck.addCard(BlackjackCard.createBlackjackCard(suit, String.valueOf(i)));
			}

			// generate non-numerical cards:
			for (NonNumericalCard card : NonNumericalCard.values()) {
				deck.addCard(BlackjackCard.createBlackjackCard(suit, card.toString()));
			}
		}
		return deck;
	}
	
	/**
	 * Adds a card to this deck at an undetermined position
	 * 
	 * @param c the card to add
	 */
	public void addCard(BlackjackCard c) {
		cards.add(c);
	}


	public List<BlackjackCard> getCards() {
		return new ArrayList<>(cards);
	}


	/**
	 * Re-orders the cards into a random order
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}


	public BlackjackCard draw() {
		return cards.pop();
	}


	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (BlackjackCard c : cards) {
			result.append(c);
			result.append('\n');
		}
		return result.toString();
	}

}