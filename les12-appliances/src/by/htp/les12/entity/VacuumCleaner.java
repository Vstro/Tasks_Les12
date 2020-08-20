package by.htp.les12.entity;

public class VacuumCleaner extends Wired {
	private final String FILTER_TYPE;
	private final String BAG_TYPE;
	private final String WAND_TYPE;
	
	public VacuumCleaner(int price, int weight, int powerConsumption, String filterType, String bagType, String wandType) {
		super(price, weight, powerConsumption);
		this.BAG_TYPE = bagType;
		this.FILTER_TYPE = filterType;
		this.WAND_TYPE = wandType;
	}

	public String getFilterType() {
		return FILTER_TYPE;
	}

	public String getBagType() {
		return BAG_TYPE;
	}

	public String getWandType() {
		return WAND_TYPE;
	}

	@Override
	public String toString() {
		return "Vacuum Cleaner with PRICE = " + this.getPrice();
	}
}
