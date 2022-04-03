package application;

import Entities.Tipos;

public class principal {

	public static void main(String[] args) {
		
		Tipos lista = new Tipos<Double>();
		lista.Adicionar("Amélia");
		lista.Adicionar("Heberty");
		lista.Adicionar("Donizeti");
		lista.Adicionar("Maria");
		lista.Adicionar("Rafaela");
		lista.Adicionar("Isabella");

		
		lista.ViewAll();
	}

}
