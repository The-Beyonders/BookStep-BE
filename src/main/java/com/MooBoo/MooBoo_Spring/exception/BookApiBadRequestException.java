package com.MooBoo.MooBoo_Spring.exception;

public class BookApiBadRequestException extends RuntimeException {
    public BookApiBadRequestException(String message) {
        super(message);
    }
}
