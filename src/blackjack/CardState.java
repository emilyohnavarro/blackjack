package blackjack;

public enum CardState {

	IN_PLAY("In play"), DISCARDED("Discarded"), UNDEALT("Undealt");

	private String stateStr;

	private CardState(String s) {
		stateStr = s;
	}


	@Override
	public String toString() {
		return stateStr;
	}

}