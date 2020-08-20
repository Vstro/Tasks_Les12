package by.htp.les12.entity;

public class Speakers extends Wired {
	private final int NUMBER_OF_SPEAKERS;
	private final int MIN_FREQUENCY;
	
	public Speakers(int price, int weight, int powerConsumption, int numberOfSpeakers, int minFrequency) {
		super(price, weight, powerConsumption);
		this.NUMBER_OF_SPEAKERS  = numberOfSpeakers;
		this.MIN_FREQUENCY = minFrequency;
	}

	public int getNumberOfSpeakers() {
		return NUMBER_OF_SPEAKERS;
	}

	public int getFrequencyRange() {
		return MIN_FREQUENCY;
	}

	@Override
	public String toString() {
		return "Speakers with PRICE = " + this.getPrice();
	}
}
