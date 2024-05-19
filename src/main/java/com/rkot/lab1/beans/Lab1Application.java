package com.rkot.lab1.beans;

import com.rkot.lab1.config.BeansConfig;
import com.rkot.lab1.pet.Cheetah;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.rkot.lab1.pet.Pet;

@ComponentScan()
public class Lab1Application {

	public static void main(String[] args) {

//		SpringApplication.run(Lab1Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Pet bean = context.getBean(Pet.class);
		var primaryCheetah = context.getBean(Cheetah.class);
		bean.printPets();
	}

}
