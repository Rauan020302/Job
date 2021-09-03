package com.example.demo.service;

import com.example.demo.entity.Pay;
import com.example.demo.repository.PayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayRepo payRepo;

    @Override
    public Pay pay(Pay pay) {
        return payRepo.save(pay);
    }
}
