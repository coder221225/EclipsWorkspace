package in.sp.main.exception;

import in.sp.main.entities.ExceptionResponse;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import in.sp.main.entities.ExceptionResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(UserAlreadyExistException.class)
public ResponseEntity<ExceptionResponse> handleUserAlreadyExistException(UserAlreadyExistException ex,
		WebRequest webRequest)
{
	ExceptionResponse exceptionResponse=new ExceptionResponse(
			webRequest.getDescription(false),
			HttpStatus.CONFLICT,
			ex.getMessage(),
			LocalDateTime.now());
	System.out.println(exceptionResponse);
	return ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponse);
}

@ExceptionHandler(UserNotFoundException.class)
public ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundException ex,WebRequest webRequest)
{
	ExceptionResponse exceptionResponse=new ExceptionResponse(
			webRequest.getDescription(false),
			HttpStatus.NOT_FOUND,
			ex.getMessage(),
			LocalDateTime.now());
	System.out.println(exceptionResponse);
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
}

@ExceptionHandler(Exception.class)
public ResponseEntity<ExceptionResponse> handleGlobalException(Exception ex,WebRequest webRequest)
{
	ExceptionResponse exceptionResponse=new ExceptionResponse(
			webRequest.getDescription(false),
			HttpStatus.INTERNAL_SERVER_ERROR,
			ex.getMessage(),
			LocalDateTime.now());
	System.out.println(exceptionResponse);
	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
}
}
