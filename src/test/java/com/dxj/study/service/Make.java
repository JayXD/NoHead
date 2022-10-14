package com.dxj.study.service;

import com.dxj.study.entity.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Make {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date parseHelp(String strDate) {
        try {
            return simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            return null;
        }
    }

    public static User aUser() {
        return User.builder()
                .uuid("8a7dc4ef83d5e6df0183d5e824800002")
                .accountUpdated(parseHelp("2022-10-14 09:51:44"))
                .accountUpdated(parseHelp("2022-10-14 09:51:44"))
                .email("bajur@nb.com")
                .password("123456")
                .firstName("jur")
                .lastName("ba")
                .build();
    }

    public static String email() {
        return "bajur@nb.com";
    }
}
