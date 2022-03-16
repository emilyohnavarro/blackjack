package blackjack;

import cards.card.Card;
import cards.card.Suit;

/**
 * Represents a card for use in a Blackjack game
 * 
 * @author emilynavarro
 *
 */
public class BlackjackCard extends Card {

	private CardState state;

	private BlackjackCard(Suit suit, String value, CardState state) {
		super(suit, value);
		this.state = state;
	}


	/**
	 * Static factory method
	 * 
	 * @param suit  the suit of the card
	 * @param value the value of the card in string form (either a number or a
	 *              String such as king, ace, queen...)
	 * 
	 * @return the new card
	 */
	public static BlackjackCard createBlackjackCard(Suit suit, String value) {
		return new BlackjackCard(suit, value, CardState.UNDEALT);
	}
	
	
	public CardState getCardState() {
		return state;
	}
	
	
	public void setCardState(CardState state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return (super.toString() + ", state: " + state);
	}

}