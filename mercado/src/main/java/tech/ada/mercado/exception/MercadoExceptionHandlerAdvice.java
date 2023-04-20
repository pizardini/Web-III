package tech.ada.mercado.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

//@RestControllerAdvice
@ControllerAdvice
public class MercadoExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler()
    ResponseEntity<MercadoNotFoundException> exceptionHandler(MercadoNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MercadoNotFoundException(e.getMessage()));
    }
}
