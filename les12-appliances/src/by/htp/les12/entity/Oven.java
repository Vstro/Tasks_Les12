package by.htp.les12.entity;

public class Oven extends BoxShaped{
	private final int capacity;
	
	public Oven(int price, int weight, int powerConsumption, int depth, int height, int width, int capacity) {
		super(price, weight, powerConsumption, depth, height, width);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public String getInfo() {
		return "Oven with PRICE = " + this.getPrice();
	}
}
