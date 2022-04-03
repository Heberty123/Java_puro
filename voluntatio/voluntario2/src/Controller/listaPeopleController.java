package Controller;

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
	
	public void addElement(People people){
		this.controle.addElementByMap(people);
	}
	
	public void removeByIdFromMap(Long key) {
		this.controle.deleteByKey(key);
	}
	
	public void order() {
		this.controle.orderByPeopleSalary();
	}
	
}
