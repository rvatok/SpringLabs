package com.rkot.lab1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration()
@ComponentScan(basePackages = "com.rkot.lab1.beans")
@Import(OtherConfig.class)
public class BeansConfig {

}
