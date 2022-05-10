package com.example.wallmarty.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Data
public class Customer {
@Id
@GeneratedValue
 private Integer customerId;
 private String customerNumber;
 private String name;
 private String contactPhoneNumber;
 private LocalDate dateOfBirth;
}