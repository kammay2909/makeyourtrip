package com.example.makeyourtrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trains {
    @GetMapping("/trains")
    public String getData() {return  "FREE FREE 21-08" ; }
}
