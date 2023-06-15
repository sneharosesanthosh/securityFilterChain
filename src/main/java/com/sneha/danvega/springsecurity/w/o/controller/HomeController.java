package com.sneha.danvega.springsecurity.w.o.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "hello world";
    }
    @GetMapping("/admin")
    public String admin() {
        return "hello admin";
    }
    @GetMapping("/user")
    public String user() {
        return "hello user";
    }
}
