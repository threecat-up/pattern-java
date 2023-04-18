package com.pattern.builder;

/**
*
* @author threecat
* @date 2023/4/18
*/
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
