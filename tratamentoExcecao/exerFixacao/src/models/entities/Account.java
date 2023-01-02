package models.entities;

import models.exception.AccountException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double ballance;
	private Double withDrawLimit;
	
	public Account() {
		super();
	}
	public Account(Integer number, String holder, Double ballance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.ballance = ballance;
		this.withDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public Double getBallance() {
		return ballance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(double amout) {
		ballance += amout;
	}
	
	public void withDraw(double amount) {
		validWithDraw(amount);
		ballance -= amount;
	}
	
	private void validWithDraw(double amount) {
		if(amount > withDrawLimit) {
			throw new AccountException ("The amount exceeds withdraw limit");
		}
		if(amount > ballance ) {
			throw new AccountException ("Not enough balance");
		}
	}

}
