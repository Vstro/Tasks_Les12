package by.htp.les12.entity;

public abstract class Appliance {
	private final int Weight;
	private final int Price;
	
	public Appliance(int price, int weight) {
		this.Weight = weight;
		this.Price = price;
	}

	public int getWeight() {
		return Weight;
	}
	
	public int getPrice() {
		return Price;
	}
	
	public abstract String getInfo();
}
