package cards.card;

/**
 * Represents a suit in a deck of playing cards
 * 
 * @author emilynavarro
 *
 */
public enum Suit {

	DIAMONDS("Diamonds"), HEARTS("Hearts"), CLUBS("Clubs"), SPADES("Spades");

	private String suitStr;

	private Suit(String s) {
		suitStr = s;
	}


	@Override
	public String toString() {
		return suitStr;
	}

}