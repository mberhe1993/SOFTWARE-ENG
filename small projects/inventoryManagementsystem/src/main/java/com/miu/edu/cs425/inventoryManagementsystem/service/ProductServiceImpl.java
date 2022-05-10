package com.miu.edu.cs425.inventoryManagementsystem.service;

import com.miu.edu.cs425.inventoryManagementsystem.model.Product;
import com.miu.edu.cs425.inventoryManagementsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(Sort.by(Sort.Direction.DESC,"unitPrice"));
    }
}
