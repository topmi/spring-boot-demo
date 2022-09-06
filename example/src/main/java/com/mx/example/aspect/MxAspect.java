package com.mx.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MxAspect {

    @Before("execution(public * com.mx.example.service.OrderService.test())")
    public void mxBefore(JoinPoint joinPoint){
        System.out.println("mxBefore.....");
    }
}
