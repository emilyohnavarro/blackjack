package cards.deck;

import cards.card.Card;
import cards.card.NonNumericalCard;
import cards.card.Suit;

/**
 * Represents a standard deck of 52 playing cards
 * 
 * @author emilynavarro
 *
 */
public class StandardCardDeck extends CardDeck {

	private StandardCardDeck() {
		super();

		for (Suit suit : Suit.values()) {

			// generate numerical cards:
			for (int i = 2; i <= 10; i++) {
				addCard(Card.createCard(suit, String.valueOf(i)));
			}

			// generate non-numerical cards:
			for (NonNumericalCard card : NonNumericalCard.values()) {
				addCard(Card.createCard(suit, card.toString()));
			}
		}
	}


	/**
	 * Static factory method
	 * 
	 * @return a new StandardCardDeck
	 */
	public static StandardCardDeck createStandardCardDeck() {
		return new StandardCardDeck();
	}


	public static void main(String[] args) {
		StandardCardDeck deck = new StandardCardDeck();
		System.out.println(deck);
	}

}