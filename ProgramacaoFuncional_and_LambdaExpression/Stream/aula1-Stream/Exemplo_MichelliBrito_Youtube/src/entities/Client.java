package entities;

public class Client {

	private String name;
	private String pass;
	private Integer point;
	
	public Client(String name, String pass, Integer point) {
		this.name = name;
		this.pass = pass;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return  name + ", " + pass + ", " + point;
	}
	
	
	
	
	
}
