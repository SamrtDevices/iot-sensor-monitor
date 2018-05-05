package com.cxing.iot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

    @RequestMapping("/index")
    public String index(){
        return "Hello Spring Boot";
    }
}
