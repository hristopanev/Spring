package com.panev.springintroapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfferController {

    @GetMapping("/reg")
    public String register() {
        return "register.html";
    }
}
