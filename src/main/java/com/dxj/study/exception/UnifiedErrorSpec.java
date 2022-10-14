package com.dxj.study.exception;

import lombok.AllArgsConstructor;

import java.util.Arrays;

public final class UnifiedErrorSpec {

    @AllArgsConstructor
    public enum LoginError implements ExceptionSpec {

        AUTH_FAIL("1000", "鉴权失败"),
        NO_INFO("1001", "无此信息"),
        ;

        private final String code;
        private final String desc;


        @Override
        public String code() {
            return this.code;
        }

        @Override
        public String desc() {
            return this.desc;
        }

        public static boolean contains(String code) {
            return Arrays.stream(values())
                    .anyMatch(o -> o.code.equals(code));
        }
    }
}
