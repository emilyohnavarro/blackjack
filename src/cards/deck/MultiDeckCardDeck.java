package cards.deck;

import cards.card.Card;

/**
 * Represents a deck of cards that consists of multiple standard decks
 * 
 * @author emilynavarro
 *
 */
public class MultiDeckCardDeck extends CardDeck {

	/**
	 * Constructs a MultiDeckCardDeck
	 * 
	 * @param numStandardDecks number of decks in this deck (must be >= 1 or else an
	 *                         IllegalArgumentException will be thrown)
	 */
	private MultiDeckCardDeck(int numStandardDecks) {
		if (numStandardDecks < 1) {
			throw new IllegalArgumentException("Number of standard decks must be >= 1");
		}
		for (int i = numStandardDecks; i > 0; i--) {
			StandardCardDeck deck = StandardCardDeck.createStandardCardDeck();
			for (Card c : deck.getCards()) {
				addCard(c);
			}
		}
	}


	/**
	 * Static factory method for creating a new MultiDeckCardDeck
	 * 
	 * @param numStandardDecks number of decks in this deck
	 * 
	 * @return a new MultiDeckCardDeck containing the given number of standard decks
	 */
	public static MultiDeckCardDeck createDeck(int numStandardDecks) {
		return new MultiDeckCardDeck(numStandardDecks);
	}


	public static void main(String[] args) {
		MultiDeckCardDeck d = MultiDeckCardDeck.createDeck(1);
		System.out.println(d);
		System.out.println();
		d.shuffle();
		System.out.println(d);
		System.out.println();
		d.shuffle();
		System.out.println(d);
		System.out.println();
		d.shuffle();
		System.out.println(d);
	}

}