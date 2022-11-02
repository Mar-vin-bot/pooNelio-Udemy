
public class Student {
	
	public String name;
	public double materia1;
	public double materia2;
	public double materia3;
	
	public Student(String name, double materia1, double materia2, double materia3) {
		super();
		this.name = name;
		this.materia1 = materia1;
		this.materia2 = materia2;
		this.materia3 = materia3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMateria1() {
		return materia1;
	}

	public void setMateria1(double materia1) {
		this.materia1 = materia1;
	}

	public double getMateria2() {
		return materia2;
	}

	public void setMateria2(double materia2) {
		this.materia2 = materia2;
	}

	public double getMateria3() {
		return materia3;
	}

	public void setMateria3(double materia3) {
		this.materia3 = materia3;
	}
	
	public double notaFinal() {
		return materia1+materia2+materia3;
	}
	
	public String passOrFailed () {
		if (notaFinal() >= 60){
			return "Pass";
		}
		return "Failed";
	}
	

	
	public String toString() {
		return name +" "+notaFinal()+" "+passOrFailed();
	}
	
	

}
