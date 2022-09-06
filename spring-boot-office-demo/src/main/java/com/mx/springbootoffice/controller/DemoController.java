package com.mx.springbootoffice.controller;

import com.mx.springbootoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {

        return userService.test();
    }
}
