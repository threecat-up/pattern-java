package com.pattern.facade;

/**
*
* @author threecat
* @date 2023/4/20
*/
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
