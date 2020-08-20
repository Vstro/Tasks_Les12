package by.htp.les12.entity;

public abstract class Digital extends Unwired {
	private final int DISPLAY_INCHES;
	private final int MEMORY_ROM;
	
	public Digital(int price, int weight, int batteryCapacity, int displayInches, int memoryROM) {
		super(price, weight, batteryCapacity);
		this.DISPLAY_INCHES = displayInches;
		this.MEMORY_ROM = memoryROM;
	}
	
	public int getDisplayInches() {
		return this.DISPLAY_INCHES;
	}
	
	public int getMemoryROM() {
		return this.MEMORY_ROM;
	}
	
	@Override
	public String toString() {
		return "Digital with PRICE = " + this.getPrice();
	}
}
