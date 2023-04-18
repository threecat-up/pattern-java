package com.pattern.builder;

/**
*
* @author threecat
* @date 2023/4/18
*/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
