package com.rkot.lab1.other;

import com.rkot.lab1.beans.BeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OtherBeanC {
    @Autowired
    BeanC beanC;

    private OtherBeanC() {
        System.out.println("from constructor " + beanC);
    }

    @PostConstruct
    public void post() {
        System.out.println("@postconstructor " + beanC + " "+beanC.hashCode());
    }

}
