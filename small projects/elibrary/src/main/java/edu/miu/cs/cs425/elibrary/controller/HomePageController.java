package edu.miu.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    public HomePageController() {
    }

    @GetMapping("/")
    public String displayHomePage(){
        return "index";
    }

    @GetMapping("/books")
    public String displayBook(){
        return "browse";
    }
}
