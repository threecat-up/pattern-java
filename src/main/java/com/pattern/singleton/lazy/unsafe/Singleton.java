package com.pattern.singleton.lazy.unsafe;

/**
*
* @author threecat
* @date 2023/4/17
*/
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }
}
