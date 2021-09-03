package com.example.demo.service;

import com.example.demo.entity.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> get();
    Supplier save(Supplier supplier);
}
