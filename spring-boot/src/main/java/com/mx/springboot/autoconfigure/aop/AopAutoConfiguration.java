package com.mx.springboot.autoconfigure.aop;

import com.mx.springboot.ConditionalOnClass;
import com.mx.springboot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
public class AopAutoConfiguration implements AutoConfiguration {

    @EnableAspectJAutoProxy
    @ConditionalOnClass("org.aspectj.weaver.Advice")
    class AspectjConfiguration {

    }
}
