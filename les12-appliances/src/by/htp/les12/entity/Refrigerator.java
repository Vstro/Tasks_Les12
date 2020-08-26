package by.htp.les12.entity;

public class Refrigerator extends BoxShaped{
	private final int freezerCapacity;
	private final int overallCapacity;
	
	public Refrigerator(int price, int weight, int powerConsumption, int depth, int height, int width, int freezerCapacity, int overallCapacity) {
		super(price, weight, powerConsumption, depth, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public String getInfo() {
		return "Refrigerator with PRICE = " + this.getPrice();
	}
}
