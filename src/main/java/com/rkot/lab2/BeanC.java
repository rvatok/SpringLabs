package com.rkot.lab2;

public class BeanC {
    private String name;
    private int value;

    public BeanC(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void customInit() {
        System.out.println("BeanC customInit method");
    }

    public void customDestroy() {
        System.out.println("BeanC customDestroy method");
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
