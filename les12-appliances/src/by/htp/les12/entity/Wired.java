package by.htp.les12.entity;

public abstract class Wired extends Appliance {
	private final int POWER_CONSUMPTION;
	
	public Wired(int price, int weight, int powerConsumption) {
		super(price, weight);
		this.POWER_CONSUMPTION = powerConsumption;
	}
	
	public int getPowerConsumption() {
		return this.POWER_CONSUMPTION;
	}
	
	@Override
	public String toString() {
		return "Wired with PRICE = " + this.getPrice();
	}
}
