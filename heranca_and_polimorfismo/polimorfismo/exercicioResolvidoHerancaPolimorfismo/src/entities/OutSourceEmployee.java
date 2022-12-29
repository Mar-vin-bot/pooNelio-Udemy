package entities;

public class OutSourceEmployee extends Employee {
	
	private Double addCharge;
	
	public OutSourceEmployee() {}

	public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double addCharge) {
		super(name, hours, valuePerHour);
		this.addCharge = addCharge;
	}

	public Double getAddCharge() {
		return addCharge;
	}

	public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;
	}

	@Override
	public double payment() {
		return super.payment()+(1.1 * addCharge);
	}
	
	
	

}
