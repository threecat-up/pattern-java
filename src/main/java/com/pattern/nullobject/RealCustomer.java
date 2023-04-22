package com.pattern.nullobject;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
