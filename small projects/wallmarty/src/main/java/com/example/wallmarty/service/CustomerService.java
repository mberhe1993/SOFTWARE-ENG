package com.example.wallmarty.service;

import com.example.wallmarty.model.Customer;

import java.util.List;

public interface CustomerService {

    public abstract List<Customer> getAllCustomer();
    public abstract Customer add(Customer customer);
    public abstract List<Customer> getPrimeCustomer();

}
