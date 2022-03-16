package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import entities.Produto;

public class principal {
	public static void main(String[] args) {
		
		Map<Integer, Produto> map = new HashMap<Integer, Produto>();
		
		map.put(1, new Produto("Apple", 6.500));
		map.put(2, new Produto("Notebook", 13.876));
		map.put(3, new Produto("microwave", 3.456));
		map.put(4, new Produto("microwave", 3.432));
		

		
		System.out.println(map);
		System.out.println("\n\n");
		
		Produto optional = map.remove(2);
		
		System.out.println("Foi removido: " + optional);
	
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " "
                               + m.getValue());
        }
        
        System.out.println("\n\n\n");
	
        Set<Entry<Integer, Produto>> set = map.entrySet();
        
        for (Entry<Integer, Produto> entry : set) {
			System.out.println("key -> " + entry.getKey() + " value: " + entry.getValue());
		}
	
	}
	
}
