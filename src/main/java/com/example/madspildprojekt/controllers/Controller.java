package com.example.madspildprojekt.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/forretning")
    public String forretning(){
        return "forretning";
    }

    @GetMapping("/fakta")
    public String fakta(){
        return "fakta";
    }

    @GetMapping("/mindremadspild")
    public String mindremadspild(){
        return "mindremadspild";
    }
}
