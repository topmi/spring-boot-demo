package com.mybatis.springboot;

import com.mx.springboot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisAutoConfiguration implements AutoConfiguration {

    @Bean
    public MybatisTest mybatisTest() {
        return new MybatisTest("MybatisAutoConfiguration bean MybatisTest");
    }
}
