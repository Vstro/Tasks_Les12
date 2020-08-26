package by.htp.les12.main;

import by.htp.les12.entity.*;
import by.htp.les12.logic.StorageLogic;
import by.htp.les12.view.StorageViewver;

public class Main {

	public static void main(String[] args) {
		Storage storage = new Storage();
		StorageLogic logic = new StorageLogic();
		StorageViewver view = new StorageViewver();
		
		storage.add(new Laptop(800, 1, 2000, 15, 8000, 1500, 3.2, "Android"));
		storage.add(new Oven(900, 65, 2000, 60, 40, 70, 33));
		storage.add(new Refrigerator(1200, 100, 200, 40, 250, 80, 20, 300));
		storage.add(new Speakers(100, 1, 20, 2, 3));
		storage.add(new TabletPC(1000, 1, 5, 16, 16000, 8, "green"));
		storage.add(new VacuumCleaner(700, 15, 100, "B", "AA-89", "all-in-one"));
		
		view.printAll("All appliances:", storage.getAppliances());
		
		System.out.println("The most expensive appliance's cost is " + logic.theMostExpensive(storage).getPrice());
	}

}
