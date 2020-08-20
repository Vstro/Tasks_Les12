package by.htp.les12.entity;

public class Laptop extends Digital {
	private final int SYSTEM_MEMORY;
	private final double CPU;
	private final String OS;
	
	public Laptop(int price, int weight, int batteryCapacity, int displayInches, int memoryROM, int systemMemory, double CPU, String OS) {
		super(price, weight, batteryCapacity, displayInches, memoryROM);
		this.SYSTEM_MEMORY = systemMemory;
		this.CPU = CPU;
		this.OS = OS;
	}

	public int getSystemMemory() {
		return SYSTEM_MEMORY;
	}

	public double getCPU() {
		return CPU;
	}

	public String getOS() {
		return OS;
	}
	
	@Override
	public String toString() {
		return "Laptop with PRICE = " + this.getPrice();
	}
}
