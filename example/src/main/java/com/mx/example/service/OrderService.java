package com.mx.example.service;

import com.mybatis.springboot.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private MybatisTest mybatisTest;

    public String test() {
        return "ok test " + mybatisTest.getName();
    }
}
