package com.example.app1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class Api {
    public static int count = 0;
    @GetMapping("/test1")
    public String test1(){
        count++;
        log.info("Phan Thị Xuyên - Võ Văn Tùng - Võ Thị Ngọc Uyên");
        return "Phan Thị Xuyên - Võ Văn Tùng - Võ Thị Ngọc Uyên";
    }
}
