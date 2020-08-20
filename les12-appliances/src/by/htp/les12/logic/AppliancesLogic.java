package by.htp.les12.logic;

import java.util.List;

import by.htp.les12.entity.*;

public class AppliancesLogic {
	public Appliance theMostExpensive(Appliances appliances) {
		List<Appliance> apps = appliances.getAppliances();
		int iMax = 0;
		
		for (int i = 1; i < apps.size(); i++) {
			if (apps.get(i).getPrice() > apps.get(iMax).getPrice()) {
				iMax = i;
			}
		}
		
		return apps.get(iMax);
	}
}
