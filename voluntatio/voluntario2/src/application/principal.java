package application;

import Controller.listaPeopleController;
import entities.People;
import entities.listaPeople;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listaPeopleController lista = new listaPeopleController(new listaPeople());
		
		lista.addElement(1L, new People("Heberty", 12.780));
		lista.addElement(2L, new People("Am�lia", 42.780));
		lista.addElement(3L, new People("Donizeti", 22.780));
		
		lista.getViewAllMap();
		lista.order();
		lista.getViewAllMap();
	}

}
