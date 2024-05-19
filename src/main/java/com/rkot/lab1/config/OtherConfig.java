package com.rkot.lab1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration()
@ComponentScan(basePackages = "com.rkot.lab1.other")
@Import(PetConfig.class)
public class OtherConfig {

}
