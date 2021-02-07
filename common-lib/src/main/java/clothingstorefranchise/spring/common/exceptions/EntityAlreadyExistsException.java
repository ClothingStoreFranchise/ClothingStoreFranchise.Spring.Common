package clothingstorefranchise.spring.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EntityAlreadyExistsException extends BaseException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityAlreadyExistsException() { }
	public EntityAlreadyExistsException(String message) { super(message); }
	public EntityAlreadyExistsException(final String message, final Throwable inner) { super(message, inner); }
	
	@Override
	public String getDescription() {
		return "Entity already exists";
	}
}
