package com.pattern.singleton.hungry;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
