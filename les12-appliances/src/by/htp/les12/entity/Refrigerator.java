package by.htp.les12.entity;

public class Refrigerator extends BoxShaped{
	private final int FREEZER_CAPACITY;
	private final int OVERALL_CAPACITY;
	
	public Refrigerator(int price, int weight, int powerConsumption, int depth, int height, int width, int freezerCapacity, int overallCapacity) {
		super(price, weight, powerConsumption, depth, height, width);
		this.FREEZER_CAPACITY = freezerCapacity;
		this.OVERALL_CAPACITY = overallCapacity;
	}

	public int getFreezerCapacity() {
		return FREEZER_CAPACITY;
	}

	public int getOverallCapacity() {
		return OVERALL_CAPACITY;
	}

	@Override
	public String toString() {
		return "Refrigerator with PRICE = " + this.getPrice();
	}
}
