package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salario;
	
	public Employee(String name, double salario) {
		this.name = name;
		this.salario = salario;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.name + ", salário: " + this.salario;
	}


	@Override
	public int compareTo(Employee o) {
		return this.salario.compareTo(o.salario);
	}
	
}
