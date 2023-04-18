package com.pattern.builder;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
