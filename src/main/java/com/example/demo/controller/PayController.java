package com.example.demo.controller;

import com.example.demo.entity.Pay;
import com.example.demo.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pay")
public class PayController {
    @Autowired
    private PayService payService;

    @PostMapping
    public Pay pay(@RequestBody Pay pay){
        return payService.pay(pay);
    }
}
