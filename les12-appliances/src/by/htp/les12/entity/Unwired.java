package by.htp.les12.entity;

public abstract class Unwired extends Appliance {
	private final int batteryCapacity;
	
	public Unwired(int price, int weight, int batteryCapacity) {
		super(price, weight);
		this.batteryCapacity = batteryCapacity;
	}
	
	public int getBatteryCapacity() {
		return this.batteryCapacity;
	}
	
	public String getInfo() {
		return "Unwired with PRICE = " + this.getPrice();
	}
}
