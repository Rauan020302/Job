package com.example.demo.service;

import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepo supplierRepo;


    @Override
    public List<Supplier> get() {
        return supplierRepo.findAll();
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepo.save(supplier);
    }
}
