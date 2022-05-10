package com.example.wallmarty.repository;

import com.example.wallmarty.model.Customer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    public List<Customer> getPrimeCustomers();
}
