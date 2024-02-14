package com.sboot.demo.sbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.demo.sbootexample.entity.Employee;

@Repository
public interface empRepository extends JpaRepository<Employee, Integer>{
    
}
