package com.example.demo.controller;

import com.example.demo.entity.Supplier;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier){
        return supplierService.save(supplier);
    }
    @GetMapping
    public List<Supplier> get(){
        return supplierService.get();
    }

}
