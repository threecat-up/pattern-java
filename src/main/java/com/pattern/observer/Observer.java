package com.pattern.observer;

/**
*
* @author threecat
* @date 2023/4/22
*/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
