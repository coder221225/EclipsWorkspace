package in.sp.main.entities;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;


public class ExceptionResponse {
	
	private String apiPath;
	private HttpStatus statusCode;
	private String errorMessage;
	private LocalDateTime errorTime;

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(LocalDateTime errorTime) {
		this.errorTime = errorTime;
	}

	public ExceptionResponse(String apiPath, HttpStatus statusCode, String errorMessage, LocalDateTime errorTime) {
		// TODO Auto-generated constructor stub
		this.apiPath=apiPath;
		this.statusCode=statusCode;
		this.errorMessage=errorMessage;
		this.errorTime=errorTime;
	}
	
}
