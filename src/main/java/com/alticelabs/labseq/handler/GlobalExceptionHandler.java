package com.alticelabs.labseq.handler;

import com.alticelabs.labseq.dto.ErrorResponseDTO;
import com.alticelabs.labseq.exceptions.InvalidValueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDTO> generalException(Exception exception, WebRequest request) {
        ErrorResponseDTO dto = ErrorResponseDTO.builder()
                .errorMessage("Fixed an internal server error")
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();

        logError(exception);

        return ResponseEntity.status(dto.getStatusCode()).body(dto);
    }

    @ExceptionHandler(InvalidValueException.class)
    public ResponseEntity<ErrorResponseDTO> invalidValueHandleException(InvalidValueException exception, WebRequest request) {
        ErrorResponseDTO dto = ErrorResponseDTO.builder()
                .errorMessage(exception.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();

        logError(exception);

        return ResponseEntity.status(dto.getStatusCode()).body(dto);
    }

    private void logError(Exception exception) {
        StackTraceElement[] stackTraceElements = exception.getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.err.println(element);
        }
    }
}
