package cards.card;

public class Card {

	private Suit suit;
	private String value;

	public Card(Suit suit, String value) {
		this.suit = suit;
		this.value = value;
	}


	/**
	 * Factory method for creating a new card
	 * 
	 * @param suit  the suit of the card
	 * @param value the value of the card in string form (either a number or a
	 *              String such as king, ace, queen...)
	 * 
	 * @return a new card
	 */
	public static Card createCard(Suit suit, String value) {
		return new Card(suit, value);
	}

	
	public Suit getSuit() {
		return suit;
	}
	
	
	public String getValue() {
		return value;
	}
	
	
	@Override
	public String toString() {
		return value + " of " + suit;
	}
}