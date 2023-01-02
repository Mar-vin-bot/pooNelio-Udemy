package model.exception;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L; //need when class extends Exception (default)
	
	public DomainException(String mgn) {
		super(mgn);
	}
	
	

}
