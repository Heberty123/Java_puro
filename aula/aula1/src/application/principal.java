package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entities.Employee;


public class principal {

	public static void main(String[] argc) {
		
		
		String file = "C:\\\\Users\\\\heber\\\\OneDrive\\\\Documentos\\\\programação\\\\java\\\\aula\\\\aula1\\\\in.txt";
		FileReader arquive = null;
		List<Employee> lista = new ArrayList<>();
		
		
		try {
			arquive = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(arquive)){
			String line = "";
			
			line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				lista.add(new Employee(fields[0], Double.valueOf(fields[1])));
				line = br.readLine();
			}
			
			Collections.sort(lista);
			
			for (Employee employee : lista) {
				System.out.println(employee);
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
