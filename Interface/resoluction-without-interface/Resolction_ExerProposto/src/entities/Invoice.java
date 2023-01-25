package entities;

public class Invoice {
	
	private Double basicPAyment;
	private Double tax;
	
	public Invoice() {}
	
	public Invoice(Double basicPAyment, Double tax) {
		this.basicPAyment = basicPAyment;
		this.tax = tax;
	}

	public Double getBasicPAyment() {
		return basicPAyment;
	}

	public void setBasicPAyment(Double basicPAyment) {
		this.basicPAyment = basicPAyment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPAyment() + getTax();
	}

}
