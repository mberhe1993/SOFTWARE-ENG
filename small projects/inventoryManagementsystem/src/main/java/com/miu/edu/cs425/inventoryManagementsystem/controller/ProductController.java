package com.miu.edu.cs425.inventoryManagementsystem.controller;

import com.miu.edu.cs425.inventoryManagementsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/gam/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/list")
    public String displayProducts(Model model){
        model.addAttribute("products",productService.getAllProducts());

        return "list";
    }

}
