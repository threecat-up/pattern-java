package com.pattern.prototype;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Circle::draw() method.");
    }
}
