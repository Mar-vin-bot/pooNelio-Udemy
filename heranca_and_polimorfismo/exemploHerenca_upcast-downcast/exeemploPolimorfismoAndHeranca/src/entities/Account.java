package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double ballance; //protected: para herdeiros terem acesso
	
	public Account() {	}

	public Account(Integer number, String holder, Double ballance) {
		super();
		this.number = number;
		this.holder = holder;
		this.ballance = ballance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBallance() {
		return ballance;
	}

	public void withDraw(double amount) {
		ballance -= amount;
	}
	
	public void deposit(double amount) {
		ballance -= amount;
	}
	
}
