package com.pattern.factory;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}
