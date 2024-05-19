package com.rkot.lab1.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {
    OtherBeanB bean;
    public OtherBeanB() {
        System.out.println(getClass().getName());
    }

    @Autowired
    public String setBean(OtherBeanB beanB) {
        this.bean = beanB;
        System.out.println(this.getClass().getSimpleName() + ". "+ bean.getClass().getSimpleName() +
                " was inhected by setter ");
        return "setBeanB";
    }
}
