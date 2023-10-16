package vianaweb.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import vianaweb.course.service.exceptions.DataBaseException;
import vianaweb.course.service.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceHandlerException {

	@ExceptionHandler (ResourceNotFoundException.class)
		public ResponseEntity<StandartError> resourceNotFound 
		(ResourceNotFoundException e,HttpServletRequest request) {
			
			String error = "Resource not found";
			HttpStatus status = HttpStatus.NOT_FOUND;
			StandartError err = new StandartError(Instant.now(), status.value(),
					error, e.getMessage(), request.getRequestURI());
			
			return ResponseEntity.status(status).body(err);
			
		}
	
	
	@ExceptionHandler (DataBaseException.class)
	public ResponseEntity<StandartError> dataBase 
	(DataBaseException e,HttpServletRequest request) {
		
		String error = "DataBase error!";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandartError err = new StandartError(Instant.now(), status.value(),
				error, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
		
	}
	
	

}
