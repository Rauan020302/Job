package com.example.demo.repository;

import com.example.demo.entity.Check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepo extends JpaRepository<Check,Long> {
}
