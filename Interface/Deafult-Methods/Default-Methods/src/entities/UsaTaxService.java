package entities;

import entities.service.TaxService;

public class UsaTaxService implements TaxService {
	
	private Double interestRate;

	public UsaTaxService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

}
