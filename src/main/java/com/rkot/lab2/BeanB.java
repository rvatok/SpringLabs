package com.rkot.lab2;

public class BeanB {
    private String name;
    private int value;

    public BeanB(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void customInit() {
        System.out.println("BeanB customInit method");
    }

    public void customDestroy() {
        System.out.println("BeanB customDestroy method");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
