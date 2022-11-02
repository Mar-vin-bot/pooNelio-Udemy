package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double dollarToReal(double cotacao, double qtsDollar) {
		return (cotacao * qtsDollar)* IOF ;
	}

}
