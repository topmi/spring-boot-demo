package com.mx.springbootoffice.initializer;

import com.mx.springbootoffice.filter.MxTypeExcluterFilter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MxApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.getBeanFactory().registerSingleton("mxTypeExcluterFilter",new MxTypeExcluterFilter());
    }
}
