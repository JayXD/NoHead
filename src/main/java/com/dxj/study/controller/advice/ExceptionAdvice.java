package com.dxj.study.controller.advice;

import com.dxj.study.exception.MiscException;
import com.dxj.study.exception.UnifiedErrorSpec;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {

    @ExceptionHandler({MiscException.class})
    public ResponseEntity<ExceptionBody> exceptionHandler(MiscException e) {
        //TODO 异常分类策略优化
        if (e.getCode().equals(UnifiedErrorSpec.LoginError.AUTH_FAIL.code())) {
            return new ResponseEntity<>(ExceptionBody.builder()
                    .code(e.getCode())
                    .msg(e.getDesc())
                    .build(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
