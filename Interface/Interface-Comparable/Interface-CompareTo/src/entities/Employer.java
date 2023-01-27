package entities;

public class Employer implements Comparable<Employer> {
	
	private String name;
	private Double salary;
	
	
	public Employer(String name, Double salary) {
		this.name = name;
		this.salary = salary;
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


	@Override
	public int compareTo(Employer objeto) {
		
		return name.compareTo(objeto.getName());
		//return -name.compareTo(objeto.getName());
		//return salary.compareTo(objeto.getSalary()); // ordenar por salrio ordem crescente
		//return -salary.compareTo(objeto.getSalary());	// ordenar salario em ordem decrescente
		
	}

}
