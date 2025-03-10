package com.ecom.demo.repository;
import com.ecom.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }