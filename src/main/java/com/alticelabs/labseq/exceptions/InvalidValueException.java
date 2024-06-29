package com.alticelabs.labseq.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class InvalidValueException extends RuntimeException {

    private static final String MSG = "Invalid Value";

    public InvalidValueException() {
        super(MSG);
    }

}
