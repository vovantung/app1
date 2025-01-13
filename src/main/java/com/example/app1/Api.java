package com.example.app1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class Api {
    @GetMapping("/health-check")
    public String healthCheck(){
        log.info("Võ Văn Tùng");
        return "Võ Văn Tùng";
    }
}
