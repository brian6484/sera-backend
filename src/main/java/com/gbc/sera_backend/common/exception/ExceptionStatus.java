package com.well.netflixclone.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@Getter
public enum ExceptionStatus {
    // USER
    // 404 NOT FOUND
    USER_NOT_FOUND(NOT_FOUND, Code.USER, "400", "user not found"),

    // AUTH
    // 500 INTERNAL SERVER ERROR
    ENCRYPT_ERROR(INTERNAL_SERVER_ERROR, Code.AUTH, "69", "encrypt error"),;

    private final HttpStatus httpStatus;

    private final String codeType;

    private final String code;

    private final String message;

    public String getCode(){
        return this.codeType + code;
    }

    private static class Code {
        private final static String USER = "USR";
        private final static String MOVIE = "MOV";
        private final static String AUTH = "ATH";
    }
}
