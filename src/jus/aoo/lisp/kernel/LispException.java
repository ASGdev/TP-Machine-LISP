package kernel;

public class LispException extends Exception {

	/**
	 * 
	 */
	// pour r�soudre une erreur de compilation de Java
	private static final long serialVersionUID = 1L;

	public LispException(String message) {
		super(message);
	}
}
