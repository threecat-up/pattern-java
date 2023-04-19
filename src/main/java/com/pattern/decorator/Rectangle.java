package com.pattern.decorator;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
