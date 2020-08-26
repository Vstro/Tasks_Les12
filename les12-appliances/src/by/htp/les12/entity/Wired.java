package by.htp.les12.entity;

public abstract class Wired extends Appliance {
	private final int powerConsumption;
	
	public Wired(int price, int weight, int powerConsumption) {
		super(price, weight);
		this.powerConsumption = powerConsumption;
	}
	
	public int getPowerConsumption() {
		return this.powerConsumption;
	}
	
	public String getInfo() {
		return "Wired with PRICE = " + this.getPrice();
	}
}
