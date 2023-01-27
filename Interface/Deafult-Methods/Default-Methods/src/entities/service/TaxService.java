package entities.service;

import java.security.InvalidParameterException;

public interface TaxService {
	
	public double getInterestRate();
	
	public default Double payment(Double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException ("The number of month must be greater than 1");
		}
		double auxTax = getInterestRate() / 100 +1;
		return amount * Math.pow(auxTax, months);
	}

}
/*
 * Metodo default na interface faz com que um metodo que trabalhará igual nas classes possa ser
 * implementado direto na interface evitando redundancia de cogigo e aumentando o re-uso 
 */
