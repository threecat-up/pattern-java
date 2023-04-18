package com.pattern.prototype;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}
