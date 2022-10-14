package com.dxj.study.service.convertor;

import com.dxj.study.domain.AccountDetails;
import com.dxj.study.entity.User;

import java.util.Date;

public class UserConvertor {
    public static AccountDetails convertor(User user) {
        return AccountDetails.builder()
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    public static User convertor(AccountDetails accountDetails) {
        Date date = new Date();
        return User.builder()
                .email(accountDetails.getEmail())
                .firstName(accountDetails.getFirstName())
                .lastName(accountDetails.getLastName())
                .password(accountDetails.getPassword())
                .accountCreated(date)
                .accountUpdated(date)
                .build();
    }
}
