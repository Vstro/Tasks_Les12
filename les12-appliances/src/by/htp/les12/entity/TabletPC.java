package by.htp.les12.entity;

public class TabletPC extends Digital {
	private final int flashMemoryCapacity;
	private final String color;
	
	public TabletPC(int price, int weight, int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
		super(price, weight, batteryCapacity, displayInches, memoryROM);
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}
	
	public String getInfo() {
		return "TabletPC with PRICE = " + this.getPrice();
	}
}
