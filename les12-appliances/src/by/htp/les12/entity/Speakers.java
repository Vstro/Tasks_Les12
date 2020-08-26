package by.htp.les12.entity;

public class Speakers extends Wired {
	private final int numberOfSpeakers;
	private final int minFrequency;
	
	public Speakers(int price, int weight, int powerConsumption, int numberOfSpeakers, int minFrequency) {
		super(price, weight, powerConsumption);
		this.numberOfSpeakers  = numberOfSpeakers;
		this.minFrequency = minFrequency;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public int getMinFrequency() {
		return minFrequency;
	}

	public String getInfo() {
		return "Speakers with PRICE = " + this.getPrice();
	}
}
