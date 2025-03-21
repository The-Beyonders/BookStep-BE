package com.MooBoo.MooBoo_Spring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    private String message;
    private String status;
    private T data;

    public static <T> Result<T> wrapper(String message, String status,T data) {
        Result<T> result = new Result<>(message, status, data);
        return result;
    }
}
