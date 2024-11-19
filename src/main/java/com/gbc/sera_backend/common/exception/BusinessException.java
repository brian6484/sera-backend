package com.well.netflixclone.common.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private final ExceptionStatus exceptionStatus;
    private final String[] args;


    public BusinessException(final ExceptionStatus exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
        this.args = null;
    }

    public BusinessException(final ExceptionStatus exceptionStatus, final String ... args) {
        this.exceptionStatus = exceptionStatus;
        this.args = args;
    }
}
