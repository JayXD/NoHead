package com.dxj.study.controller;

public class BaseController {
    public String getToken(String cookie) {
        if (null == cookie) {
            return null;
        }
        String[] split = cookie.split("=");
        if (split.length < 2) {
            return null;
        }
        return split[1];
    }
}
