package com.dxj.study.controller.advice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Jacksonized
@Getter
public class ExceptionBody implements Serializable {
    private String code;
    private String msg;
}
