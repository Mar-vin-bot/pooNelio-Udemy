package entities;

public class SavingsAccount extends Account {
	
	private Double interesRate;
	
	public SavingsAccount() {}

	public SavingsAccount(Integer number, String holder, Double ballance, Double interesRate) {
		super(number, holder, ballance);
		this.interesRate = interesRate;
	}

	public Double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	public void updateBallance () {
		ballance += ballance * interesRate;	
	}

	@Override
	public void withDraw(double amount) {
		ballance -= amount;	
	}
	
	
	
	

}
