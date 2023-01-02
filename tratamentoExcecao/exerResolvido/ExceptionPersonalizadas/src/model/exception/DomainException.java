package model.exception;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; //need when class extends Exception (default)
	
	public DomainException(String mgn) {
		super(mgn);
	}
	
	/*
	 * Troca de Exception para RuntimeException
	 * desfaz da necessidade de declarar throws DomainException nos metodos onde
	 * há a chamada de exceção, contudo foi aplicado um catch no main para que
	 * exceções não tratadas previamente sejam printadas a mgn "Unexpectd error".
	 *
	 * 
	 */
	
	

}
