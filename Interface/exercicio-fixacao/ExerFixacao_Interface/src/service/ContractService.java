package service;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double auxValueParcelas = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			 LocalDate auxDate = contract.getDataContrato().plusMonths(i);
			 
			 double auxJuros  = onlinePaymentService.interest(auxValueParcelas, i);
			 double auxFee = onlinePaymentService.paymentFee(auxValueParcelas + auxJuros);
			 double valueParcela = auxValueParcelas + auxFee + auxJuros;
			 
			 contract.getInstallment().add(new Installment(auxDate, valueParcela));
		}

	}

}
