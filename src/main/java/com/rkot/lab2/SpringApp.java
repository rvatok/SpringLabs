package com.rkot.lab2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@Import(BeanConfigB.class)
public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(CustomBeanFactoryPostProcessor.class);
        context.register(CustomBeanPostProcessor.class);
        context.register(BeanConfigB.class);


        System.out.println("All Beans in ApplicationContext:");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        context.close();
    }

    @Bean
    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}
