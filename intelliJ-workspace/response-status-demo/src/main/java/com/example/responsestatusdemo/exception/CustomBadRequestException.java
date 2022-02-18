package com.example.responsestatusdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Custom Bad Request")
public class CustomBadRequestException extends RuntimeException {

}