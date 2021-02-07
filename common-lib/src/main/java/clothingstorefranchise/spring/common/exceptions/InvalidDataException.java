package clothingstorefranchise.spring.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidDataException extends BaseException {
	
	private static final long serialVersionUID = 1L;

	public InvalidDataException() { }
	public InvalidDataException(String message) { super(message); }
	public InvalidDataException(final String message, final Throwable inner) { super(message, inner); }
	
	@Override
	public String getDescription() {
		return "Invalid data";
	}
}
