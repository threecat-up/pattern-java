package com.pattern.bridge;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
            + radius + ", x: " + x + ", " + y + "]");
    }
}
