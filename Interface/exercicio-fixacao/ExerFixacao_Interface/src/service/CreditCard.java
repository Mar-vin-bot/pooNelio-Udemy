package service;

public class CreditCard implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		
		return amount * 0.01;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		return amount * 0.03 * months;
	}
	
	

}
