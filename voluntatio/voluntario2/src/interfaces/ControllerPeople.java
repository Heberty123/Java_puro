package interfaces;

import java.util.Set;
import java.util.Map.Entry;
import entities.People;

public interface ControllerPeople {
	
	public void getViewMap();
	
	public void addElementByMap(Long key, People people);
	
	public void deleteByKey(Long key);
	
	public void orderByPeopleSalary();
}
