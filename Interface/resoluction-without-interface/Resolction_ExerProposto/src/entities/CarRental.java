package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class CarRental {
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Veiculo vehicle;
	private Invoice invoice;
	
	public CarRental() {}

	public CarRental(LocalDateTime start, LocalDateTime finish, Veiculo vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Veiculo getVehicle() {
		return vehicle;
	}

	public void setVehicle(Veiculo vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

}
