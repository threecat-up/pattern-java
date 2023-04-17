package com.pattern.abstractfactory;

/**
*
* @author threecat
* @date 2023/4/17
*/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType);
}
