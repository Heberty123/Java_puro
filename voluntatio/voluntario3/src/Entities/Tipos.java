package Entities;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Tipos<T> {

	Set<T> lista;
	
	public Tipos() {
		this.lista = new TreeSet<T>();
	}
	
	public void Adicionar(T object) {
		this.lista.add(object);
	}
	
	public void ViewAll() {
		this.lista.forEach(new Consumer<T>() {

			@Override
			public void accept(T t) {

				System.out.println(t);
			}
		});
	}
	
	public void Remover(T object) {
		this.lista.remove(object);
	}
	
	public void RemoverAll() {
		this.lista.removeAll(lista);
	}
}
