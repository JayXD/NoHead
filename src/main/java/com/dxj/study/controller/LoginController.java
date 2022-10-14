package com.dxj.study.controller;

import com.dxj.study.domain.AccountDetails;
import com.dxj.study.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping(path = "/v1/account")
@RestController
@AllArgsConstructor
public class LoginController {

    @Resource
    private final LoginService loginService;

    @GetMapping(path = "/{accountId}")
    public ResponseEntity<AccountDetails> login(@PathVariable String accountId) {
        AccountDetails accountDetails = loginService.find(accountId);
        if (null == accountDetails) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(accountDetails, HttpStatus.OK);
    }

    @PutMapping(path = "/{accountId}")
    public ResponseEntity<AccountDetails> update(@PathVariable String accountId, @RequestBody AccountDetails request) {
        AccountDetails response = loginService.update(accountId, request);
        if (null == response) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


    @PostMapping
    public ResponseEntity<AccountDetails> register(@RequestBody AccountDetails request) {
        AccountDetails response = loginService.register(request);
        if (null == response) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}