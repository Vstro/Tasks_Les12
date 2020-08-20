package by.htp.les12.entity;

public class TabletPC extends Digital {
	private final int FLASH_MEMORY_CAPACITY;
	private final String COLOR;
	
	public TabletPC(int price, int weight, int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
		super(price, weight, batteryCapacity, displayInches, memoryROM);
		this.FLASH_MEMORY_CAPACITY = flashMemoryCapacity;
		this.COLOR = color;
	}

	public int getFlashMemoryCapacity() {
		return FLASH_MEMORY_CAPACITY;
	}

	public String getColor() {
		return COLOR;
	}
	
	@Override
	public String toString() {
		return "TabletPC with PRICE = " + this.getPrice();
	}
}
