package com.rkot.lab2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:beans.properties")
public class BeanConfigA {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanD beanD() {
        return new BeanD("BeanD", 4);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanB beanB(@Value("${beanB.name}") String name, @Value("${beanB.value}") int value) {
        return new BeanB(name, value);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanC beanC(@Value("${beanC.name}") String name, @Value("${beanC.value}") int value) {
        return new BeanC(name, value);
    }
}
