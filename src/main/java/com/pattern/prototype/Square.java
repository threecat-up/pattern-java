package com.pattern.prototype;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class Square extends Shape{

    public Square() {
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Square::draw() method.");
    }
}
