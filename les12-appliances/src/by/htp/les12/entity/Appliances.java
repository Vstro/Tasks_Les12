package by.htp.les12.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliances {
	List<Appliance> appliances;
	
	public Appliances() {
		this.appliances = new ArrayList<Appliance>();
	}
	
	public Appliances(Appliance[] appliances) {
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
