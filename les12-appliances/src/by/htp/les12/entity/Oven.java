package by.htp.les12.entity;

public class Oven extends BoxShaped{
	private final int CAPACITY;
	
	public Oven(int price, int weight, int powerConsumption, int depth, int height, int width, int capacity) {
		super(price, weight, powerConsumption, depth, height, width);
		this.CAPACITY = capacity;
	}

	public int getCapacity() {
		return CAPACITY;
	}
	
	@Override
	public String toString() {
		return "Oven with PRICE = " + this.getPrice();
	}
}
