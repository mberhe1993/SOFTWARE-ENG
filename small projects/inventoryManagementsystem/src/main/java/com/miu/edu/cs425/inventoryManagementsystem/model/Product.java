package com.miu.edu.cs425.inventoryManagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(nullable = false)
    private String productNumber;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double unitPrice;
    @Column(nullable = false)
    private Integer quantityInStock;
    private LocalDate dateSupplied;

    public Product(String productNumber, String name, double unitPrice, Integer quantityInStock, LocalDate dateSupplied) {
        this.productNumber = productNumber;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.dateSupplied = dateSupplied;
    }



}
