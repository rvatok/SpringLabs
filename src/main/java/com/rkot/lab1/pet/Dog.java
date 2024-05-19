package com.rkot.lab1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
