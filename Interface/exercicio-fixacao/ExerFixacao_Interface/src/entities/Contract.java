package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate dataContrato;
	private Double totalValue;
	
	//contrato tem varias parcelas
	private List<Installment> installment = new ArrayList<>();

	public Contract(Integer number, LocalDate dataContrato, Double totalValue) {
		this.number = number;
		this.dataContrato = dataContrato;
		this.totalValue = totalValue;
	}

	public Contract() {	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getInstallment() {
		return installment;
	}

	
}
