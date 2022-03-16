package entities;

public class Produto {

	private String name;
	private Double price;
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.price;
	}
}
