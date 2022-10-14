package com.dxj.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/healthz")
@RestController
public class HealthyController {
    public ResponseEntity<String> healthy() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
