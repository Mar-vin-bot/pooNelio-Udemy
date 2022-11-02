package entities;

public class Employee {
	
	private String name;
	private double salary;
	private double tax;
	
	public Employee(String name, Double salary, Double tax) {
		super();
		this.name = name;
		this.salary = salary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	
	public double netSalary() {
		return salary - tax;
	}
	
	public void IncreaseSalary (double percentagem) {
		salary = salary * (percentagem/100 + 1);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		//metodo herdado da classe object
		//converte o obj para string
		//
		
	}
	
	
	

}
