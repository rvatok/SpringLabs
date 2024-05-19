package com.rkot.lab1.other;

import com.rkot.lab1.beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanOtherA {
    BeanA beanA;

    public BeanOtherA(BeanA a) {
        this.beanA = a;
        System.out.println(this.getClass().getSimpleName() + ". " + beanA.getClass().getSimpleName() +
                " was injected by constructor");
    }
    public BeanOtherA() {
        System.out.println(getClass().getName());
    }

    public String getBeanA() {
        return beanA.getClass().getName();
    }
}
