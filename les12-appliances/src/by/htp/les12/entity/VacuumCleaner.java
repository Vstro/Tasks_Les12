package by.htp.les12.entity;

public class VacuumCleaner extends Wired {
	private final String filterType;
	private final String bagType;
	private final String wandType;
	
	public VacuumCleaner(int price, int weight, int powerConsumption, String filterType, String bagType, String wandType) {
		super(price, weight, powerConsumption);
		this.bagType = bagType;
		this.filterType = filterType;
		this.wandType = wandType;
	}

	public String getFilterType() {
		return filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public String getInfo() {
		return "Vacuum Cleaner with PRICE = " + this.getPrice();
	}
}
