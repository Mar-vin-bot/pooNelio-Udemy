package entities;


public class Account {
	
	private static final int TAXA_SAQUE = 5;
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw( double valueSaque ) {
		balance = balance - valueSaque - TAXA_SAQUE;
		
	}
	
	public void deposito( double valueDeposit) {
		 balance += valueDeposit; 
	}

	@Override
	public String toString() {
		return "Number " + number + 
				", Holder: " + holder + 
				", Balance $ " +String.format("%.2f", balance) ;
	}
	
	
	
	
	
	
	
	

}
