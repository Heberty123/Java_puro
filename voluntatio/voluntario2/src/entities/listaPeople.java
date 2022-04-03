package entities;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import interfaces.ControllerPeople;

public class listaPeople implements ControllerPeople  {

	private Map<Long, People> map = new HashMap<Long, People>();
	private static Long id = (long) 0;
	
	@Override
	public void getViewMap() {
		
		Set<Entry<Long, People>> view = this.map.entrySet();
		
		for (Entry<Long, People> entry : view) {
			System.out.println("key -> " + entry.getKey() + ", people: " + entry.getValue());
		}
		
		
	}

	@Override
	public void addElementByMap(People people) {
		this.map.put(id, people);
		id++;
	}

	@Override
	public void deleteByKey(Long key) {
		this.map.remove(key);
		
	}

	@Override
	public void orderByPeopleSalary() {
		Map<Long, People> sortedMap = sortByValue(this.map);
		this.map = sortedMap;
		
	}
	
	
	
    private static Map<Long, People> sortByValue(Map<Long, People> mapp) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Long, People>> list =
                new LinkedList<Map.Entry<Long, People>>(mapp.entrySet());
        
        
        System.out.println("\n\nIsso é uma lista com Map: " + list);
        System.out.println("\n");
        

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Long, People>>() {
            public int compare(Map.Entry<Long, People> o1,
                               Map.Entry<Long, People> o2) {
                return o1.getValue().getSalario().compareTo(o2.getValue().getSalario());
            }
        });


        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Long, People> sortedMap = new LinkedHashMap<Long, People>();
        for (Map.Entry<Long, People> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        
		return sortedMap;
    }
    
}
