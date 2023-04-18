package com.pattern.builder;

/**
*
* @author threecat
* @date 2023/4/18
*/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
