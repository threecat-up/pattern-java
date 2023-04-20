package com.pattern.facade;

/**
*
* @author threecat
* @date 2023/4/20
*/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
