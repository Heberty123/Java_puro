package Controller;

import java.util.Set;
import java.util.Map.Entry;

import entities.People;
import interfaces.ControllerPeople;

public class listaPeopleController {

	private ControllerPeople controle;
	
	
	public listaPeopleController(ControllerPeople controle) {
		this.controle = controle;
	}
	
	
	
	public void getViewAllMap(){
		this.controle.getViewMap();
	}
	
	public void addElement(Long key, People people){
		this.controle.addElementByMap(key, people);
	}
	
	public void removeByIdFromMap(Long key) {
		this.controle.deleteByKey(key);
	}
	
	public void order() {
		this.controle.orderByPeopleSalary();
	}
	
}
