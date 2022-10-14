package com.dxj.study.exception;

public class MiscException extends BaseException {
    public MiscException(ExceptionSpec exceptionSpec) {
        super(exceptionSpec);
    }

    public MiscException(ExceptionSpec exceptionSpec, Exception e) {
        super(exceptionSpec, e);
    }
}
