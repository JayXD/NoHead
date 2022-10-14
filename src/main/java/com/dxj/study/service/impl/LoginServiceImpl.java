package com.dxj.study.service.impl;

import com.dxj.study.domain.AccountDetails;
import com.dxj.study.entity.User;
import com.dxj.study.repository.manager.UserManager;
import com.dxj.study.service.LoginService;
import com.dxj.study.service.convertor.UserConvertor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
    @Resource
    private final UserManager userManager;

    @Override
    public AccountDetails find(String email) {
        User user = userManager.queryOneUser(email);
        if (null == user) {
            return null;
        }
        return UserConvertor.convertor(user);
    }

    @Override
    public AccountDetails update(String accountId, AccountDetails accountDetails) {
        User user = userManager.queryOneUser(accountId);
        if (null == user) {
            return null;
        }
        user.assignFirstName(accountDetails.getFirstName())
                .assignLastName(accountDetails.getLastName())
                .assignPassword(accountDetails.getPassword())
                .assignAccountUpdated(new Date());
        User save = userManager.save(user);
        return UserConvertor.convertor(save);
    }

    @Override
    public AccountDetails register(AccountDetails accountDetails) {
        User user = userManager.queryOneUser(accountDetails.getEmail());
        if (null != user) {
            return null;
        }
        User save = userManager.save(UserConvertor.convertor(accountDetails));
        return UserConvertor.convertor(save);
    }
}
