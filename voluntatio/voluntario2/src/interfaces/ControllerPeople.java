package interfaces;

import entities.People;

public interface ControllerPeople {
	
	public void getViewMap();
	
	public void addElementByMap(People people);
	
	public void deleteByKey(Long key);
	
	public void orderByPeopleSalary();
}
