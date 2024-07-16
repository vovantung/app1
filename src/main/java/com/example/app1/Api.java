package com.example.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Api {
    @GetMapping("/health-check")
    public String healthCheck(){
        return "Phaan Thịn";
    }
}
