package com.rkot.lab2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanA || bean instanceof BeanB || bean instanceof BeanC || bean instanceof BeanD || bean instanceof BeanE || bean instanceof BeanF) {
            try {
                String name = (String) bean.getClass().getMethod("getName").invoke(bean);
                int value = (int) bean.getClass().getMethod("getValue").invoke(bean);
                if (name == null || value <= 0) {
                    throw new IllegalArgumentException("Invalid bean properties for: " + beanName);
                }
            } catch (Exception e) {
                throw new BeansException("Validation failed for bean: " + beanName, e) {};
            }
        }
        return bean;
    }
}
