package com.example.demo.controller;

import com.example.demo.entity.Check;
import com.example.demo.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    @PostMapping
    public Check check(@RequestBody Check check){
        return checkService.check(check);
    }
}
