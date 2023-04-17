package com.pattern.singleton.innerclass;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
