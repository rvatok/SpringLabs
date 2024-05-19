package com.rkot.lab2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA has been initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA has been destroyed");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
