package entities;

public class People {

	private String name;
	private Double salario;
	
	public People(String name, double salario) {
		this.name = name;
		this.salario = salario;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.name + ", salário: " + this.salario;
	}


}
