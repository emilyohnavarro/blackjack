package cards;

/**
 * Represents a non-numerical card in a standard deck of playing cards
 * 
 * @author emilynavarro
 *
 */

public enum NonNumericalCard {
	
	JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");
	
	private String valStr;
	
	private NonNumericalCard(String s) {
		valStr = s;
	}
	
	public String toString() {
		return valStr;
	}
}