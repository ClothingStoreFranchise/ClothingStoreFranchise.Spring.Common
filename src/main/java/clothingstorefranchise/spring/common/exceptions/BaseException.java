package clothingstorefranchise.spring.common.exceptions;

public abstract class BaseException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected BaseException() { }
	protected BaseException(final String message) { super(message); }
	protected BaseException(final String message, final Throwable inner) { super(message, inner); }
	
	public abstract String getDescription();
}
