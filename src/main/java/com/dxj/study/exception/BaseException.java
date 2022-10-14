package com.dxj.study.exception;

public abstract class BaseException extends RuntimeException {

    protected ExceptionSpec exceptionSpec;

    public BaseException(ExceptionSpec exceptionSpec) {
        super(exceptionSpec.code() + "[" + exceptionSpec.desc() + "]");
        this.exceptionSpec = exceptionSpec;
    }

    public BaseException(ExceptionSpec exceptionSpec, Exception e) {
        super(exceptionSpec.code() + "[" + exceptionSpec.desc() + "]", e);
        this.exceptionSpec = exceptionSpec;
    }

    public String getCode() {
        return exceptionSpec.code();
    }

    public String getDesc() {
        return exceptionSpec.desc();
    }
}
