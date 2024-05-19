package com.rkot.lab1.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {

//    @Autowired
//    public  Cheetah primaryCheetah;
    @Autowired
    List<Animal> animalList;

    public void printPets() {
        animalList.forEach(System.out::println);
    }
}
