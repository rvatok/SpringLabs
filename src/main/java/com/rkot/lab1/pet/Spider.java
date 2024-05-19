package com.rkot.lab1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Spider implements Animal{
    @Override
    public void sound() {
        System.out.println(this.getClass().getName());
    }
}
