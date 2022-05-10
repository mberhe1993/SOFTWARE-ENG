package com.miu.edu.cs425.inventoryManagementsystem.repository;

import com.miu.edu.cs425.inventoryManagementsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {



}
