package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {}

	public BusinessAccount(Integer number, String holder, Double ballance, Double loanLimit) {
		super(number, holder, ballance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount ) {
		if(amount <= loanLimit) {
			ballance += amount - 10.00;	
		}
		
	}

	@Override
	public void withDraw(double amount) {
		ballance -= 2.0;
	}
	
}
