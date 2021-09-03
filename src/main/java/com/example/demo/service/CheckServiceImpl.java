package com.example.demo.service;

import com.example.demo.entity.Check;
import com.example.demo.repository.CheckRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckRepo checkRepo;

    @Override
    public Check check(Check check) {
        return checkRepo.save(check);
    }
}
