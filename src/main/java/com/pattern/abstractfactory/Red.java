package com.pattern.abstractfactory;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red::fill() method.");
    }
}
