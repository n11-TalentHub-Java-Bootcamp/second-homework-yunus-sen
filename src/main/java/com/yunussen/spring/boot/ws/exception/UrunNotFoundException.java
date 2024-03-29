package com.yunussen.spring.boot.ws.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UrunNotFoundException extends RuntimeException {

    public UrunNotFoundException(String message) {
        super(message);
    }
}