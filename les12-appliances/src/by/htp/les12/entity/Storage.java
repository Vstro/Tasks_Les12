package by.htp.les12.entity;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	List<Appliance> appliances = new ArrayList<Appliance>();;
	
	public Storage() {}
	
	public Storage(Appliance[] appliances) {
		for (int i = 0; i < appliances.length; i++) {
			this.appliances.add(appliances[i]);
		}
	}
	
	public void add(Appliance appliance) {
		this.appliances.add(appliance);
	}
	
	public List<Appliance> getAppliances() {
		return this.appliances;
	}
}
