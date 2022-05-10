package com.miu.edu.cs425.inventoryManagementsystem.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/gam")
public class HomePageController {

    @RequestMapping(value = "/home")
    public String displayHome(){
        return "index";

    }
}
