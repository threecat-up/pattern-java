package com.pattern.abstractfactory;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Red::fill() method.");
    }
}
