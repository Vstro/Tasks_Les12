package by.htp.les12.view;

import java.util.List;

import by.htp.les12.entity.*;

public class StorageViewver {
	public void printAll(String message, List<Appliance> appliances) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		for (int i = 0; i < appliances.size(); i++) {
			Appliance appliance = appliances.get(i);			
			System.out.println(appliance.getInfo());
		}
	}
}
