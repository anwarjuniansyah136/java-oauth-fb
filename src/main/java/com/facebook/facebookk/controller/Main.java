package com.facebook.facebookk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
