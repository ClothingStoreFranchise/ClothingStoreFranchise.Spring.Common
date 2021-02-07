package clothingstorefranchise.spring.common.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityDoesNotExistException extends BaseException {
	private static final long serialVersionUID = 1L;

	public EntityDoesNotExistException() { }
	public EntityDoesNotExistException(String message) { super(message); }
	public EntityDoesNotExistException(final String message, final Throwable inner) { super(message, inner); }
	
	@Override
	public String getDescription() {
		return "Entity does not exists";
	}
}
