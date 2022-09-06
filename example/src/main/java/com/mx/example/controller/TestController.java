package com.mx.example.controller;

import com.mx.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    OrderService orderService;

    @GetMapping("test")
    public String test() {
        return orderService.test();
    }
}
