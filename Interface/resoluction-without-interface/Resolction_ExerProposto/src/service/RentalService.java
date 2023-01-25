package service;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService() {}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes  = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		
		double timeHour = minutes / 60; 
		double days = timeHour / 24;
		
		double valuePayment;
		if(timeHour <= 12  ) {
			valuePayment= pricePerHour * Math.ceil(timeHour);
		}else {
			valuePayment = pricePerDay * Math.ceil(days); 
		}
		
		double valueTax = taxService.tax(valuePayment);
		
		carRental.setInvoice(new Invoice(valuePayment, valueTax));
		
	}
	
	
	
	

}
