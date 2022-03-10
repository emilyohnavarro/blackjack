package cards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MultiDeckCardDeckTest {

	@Test
	void testCreationWithValidNumDecks() {
		final int STD_DECK_SIZE = 52;
		
		// valid inputs:
		assertEquals(STD_DECK_SIZE, MultiDeckCardDeck.createDeck(1).getCards().size());
		assertEquals(STD_DECK_SIZE * 2, MultiDeckCardDeck.createDeck(2).getCards().size());
		assertEquals(STD_DECK_SIZE * 3, MultiDeckCardDeck.createDeck(3).getCards().size());
		assertEquals(STD_DECK_SIZE * 5, MultiDeckCardDeck.createDeck(5).getCards().size());
		assertEquals(STD_DECK_SIZE * 20, MultiDeckCardDeck.createDeck(20).getCards().size());
		assertEquals(STD_DECK_SIZE * 100, MultiDeckCardDeck.createDeck(100).getCards().size());
		
		// invalid inputs:
		assertThrows(IllegalArgumentException.class, () -> {
			MultiDeckCardDeck.createDeck(0);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			MultiDeckCardDeck.createDeck(-1);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			MultiDeckCardDeck.createDeck(-10);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			MultiDeckCardDeck.createDeck(-100);
		});
	}

}
