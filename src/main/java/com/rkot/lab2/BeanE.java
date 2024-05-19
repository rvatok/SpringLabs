package com.rkot.lab2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
    private String name;
    private int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BeanE postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("BeanE preDestroy method");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
