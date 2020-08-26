package by.htp.les12.entity;

public class Laptop extends Digital {
	private final int systemMemory;
	private final double CPU;
	private final String OS;
	
	public Laptop(int price, int weight, int batteryCapacity, int displayInches, int memoryROM, int systemMemory, double CPU, String OS) {
		super(price, weight, batteryCapacity, displayInches, memoryROM);
		this.systemMemory = systemMemory;
		this.CPU = CPU;
		this.OS = OS;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public double getCPU() {
		return CPU;
	}

	public String getOS() {
		return OS;
	}
	
	public String getInfo() {
		return "Laptop with PRICE = " + this.getPrice();
	}
}
