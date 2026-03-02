package in.sp.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(UserAlreadyExistException.class)
public ResponseEntity<String> handleUserAlreadyExistException(UserAlreadyExistException ex)
{
	return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
}

@ExceptionHandler(UserNotFoundException.class)
public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException ex)
{
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
}
}
