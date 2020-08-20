package by.htp.les12.main;

import by.htp.les12.entity.*;
import by.htp.les12.logic.AppliancesLogic;
import by.htp.les12.view.AppliancesViewver;

public class Main {

	public static void main(String[] args) {
		Appliances appliances = new Appliances();
		AppliancesLogic logic = new AppliancesLogic();
		AppliancesViewver view = new AppliancesViewver();
		
		appliances.add(new Laptop(800, 1, 2000, 15, 8000, 1500, 3.2, "Android"));
		appliances.add(new Oven(900, 65, 2000, 60, 40, 70, 33));
		appliances.add(new Refrigerator(1200, 100, 200, 40, 250, 80, 20, 300));
		appliances.add(new Speakers(100, 1, 20, 2, 3));
		appliances.add(new TabletPC(1000, 1, 5, 16, 16000, 8, "green"));
		appliances.add(new VacuumCleaner(700, 15, 100, "B", "AA-89", "all-in-one"));
		
		view.printAll("All appliances:", appliances.getAppliances());
		
		System.out.println("The most expensive appliance is " + logic.theMostExpensive(appliances).toString());
	}

}
