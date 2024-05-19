package com.rkot.lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(BeanConfigA.class)
public class BeanConfigB {

    @Bean
    public BeanA beanA() {
        return new BeanA("BeanA", 1);
    }

    @Bean
    public BeanE beanE() {
        return new BeanE("BeanE", 5);
    }

    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF("BeanF", 6);
    }
}
