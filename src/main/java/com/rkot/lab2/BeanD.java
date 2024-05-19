package com.rkot.lab2;

public class BeanD {
    private String name;
    private int value;

    public BeanD(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void customInit() {
        System.out.println("BeanD customInit method");
    }

    public void customDestroy() {
        System.out.println("BeanD customDestroy method");
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
