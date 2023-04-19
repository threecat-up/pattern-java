package com.pattern.bridge;

/**
*
* @author threecat
* @date 2023/4/19
*/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
