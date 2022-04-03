package application;

import Controller.listaPeopleController;
import entities.People;
import entities.listaPeople;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listaPeopleController lista = new listaPeopleController(new listaPeople());
		
		lista.addElement(new People("Heberty", 12.780));
		lista.addElement(new People("Amélia", 42.780));
		lista.addElement(new People("Donizeti", 22.780));
		lista.addElement(new People("Maria", 25.780));
		lista.addElement(new People("Pedro", 46.780));
		
		lista.getViewAllMap();
		lista.order();
		lista.getViewAllMap();
	}

}
