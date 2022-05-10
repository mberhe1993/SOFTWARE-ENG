package com.example.wallmarty.service.Iml;

import com.example.wallmarty.model.Customer;
import com.example.wallmarty.repository.CustomerRepository;
import com.example.wallmarty.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getPrimeCustomer() {
        return customerRepository.getPrimeCustomers();
    }
}
