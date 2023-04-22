package com.pattern.nullobject;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
