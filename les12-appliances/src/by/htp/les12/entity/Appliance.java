package by.htp.les12.entity;

public abstract class Appliance {
	private final int WEIGHT;
	private final int PRICE;
	
	public Appliance(int price, int weight) {
		this.WEIGHT = weight;
		this.PRICE = price;
	}

	public int getWeight() {
		return WEIGHT;
	}
	
	public int getPrice() {
		return PRICE;
	}

	@Override
	public String toString() {
		return "Appliance with PRICE = " + PRICE;
	}
}
