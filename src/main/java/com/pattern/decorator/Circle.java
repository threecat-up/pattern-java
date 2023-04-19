package com.pattern.decorator;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
