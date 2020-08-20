package by.htp.les12.entity;

public abstract class Unwired extends Appliance {
	private final int BATTERY_CAPACITY;
	
	public Unwired(int price, int weight, int batteryCapacity) {
		super(price, weight);
		this.BATTERY_CAPACITY = batteryCapacity;
	}
	
	public int getBatteryCapacity() {
		return this.BATTERY_CAPACITY;
	}
	
	@Override
	public String toString() {
		return "Unwired with PRICE = " + this.getPrice();
	}
}
