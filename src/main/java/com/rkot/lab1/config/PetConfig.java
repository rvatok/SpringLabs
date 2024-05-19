package com.rkot.lab1.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import com.rkot.lab1.pet.Cheetah;
import com.rkot.lab1.pet.Spider;

@Configuration()
@ComponentScan(basePackages = "com.rkot.lab1.pet",
excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class)})
public class PetConfig {

    @Bean
//    @Qualifier("cita3")
    @Primary
    public Cheetah cheetah2() {
        return new Cheetah();
    }
//
    @Bean(initMethod = "initM")
    @Qualifier
    @Lazy
    public Cheetah primaryCheetah() {
        return new Cheetah();
    }
}
