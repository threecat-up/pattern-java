package com.pattern.abstractfactory;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}
