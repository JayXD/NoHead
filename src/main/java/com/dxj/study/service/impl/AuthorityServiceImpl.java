package com.dxj.study.service.impl;

import com.dxj.study.service.AuthorityService;
import com.dxj.study.util.AESUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    private static final String key = "1234123412341234";

    @Override
    public String getToken(String context) {
        try {
            return AESUtil.encrypt(context, key);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
