package com.dxj.study.service;

import com.dxj.study.domain.AccountDetails;

public interface LoginService {

    AccountDetails find(String email);

    AccountDetails update(String accountId, AccountDetails accountDetails);

    AccountDetails register(AccountDetails accountDetails);
}
