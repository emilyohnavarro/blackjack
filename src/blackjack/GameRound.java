package blackjack;

import cards.deck.CardDeck;

/**
 * Represents one round in a blackjack game
 * 
 * @author emilynavarro
 *
 */
public class GameRound {
	private Player dealer;
	private Player player;
	
	private GameRound(Player dealer, Player player) {
		this.dealer = dealer;
		this.player = player;
	}
	
	
	/**
	 * Static factory method
	 * 
	 * @param dealer
	 * @param player
	 * 
	 * @return the new GameRound
	 */
	public static GameRound createGameRound(Player dealer, Player player) {
		return new GameRound(dealer, player);
	}
	
	
	/**
	 * Does the initial 2-card deal to all players
	 * 
	 * @param deck
	 */
	public void deal(CardDeck deck) {
		dealer.addCardToHand(deck.draw());
		player.addCardToHand(deck.draw());
		dealer.addCardToHand(deck.draw());
		player.addCardToHand(deck.draw());
	}
}