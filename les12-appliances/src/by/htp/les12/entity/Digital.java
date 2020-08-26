package by.htp.les12.entity;

public abstract class Digital extends Unwired {
	private final int displayInches;
	private final int memoryROM;
	
	public Digital(int price, int weight, int batteryCapacity, int displayInches, int memoryROM) {
		super(price, weight, batteryCapacity);
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
	}
	
	public int getDisplayInches() {
		return this.displayInches;
	}
	
	public int getMemoryROM() {
		return this.memoryROM;
	}
	
	public String getInfo() {
		return "Digital with PRICE = " + this.getPrice();
	}
}
