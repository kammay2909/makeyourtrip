package com.example.makeyourtrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class car {
    @GetMapping("/car")
    public String getData() {return  "Secure deals on car sharing with us" ; }
}