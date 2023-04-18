package com.pattern.builder;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
