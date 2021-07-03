package com.pinnika.jpademo.repository;

import java.util.List;

import com.pinnika.jpademo.entities.Customer;

import org.springframework.data.repository.CrudRepository;
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);
    Customer findById(long id);
}
