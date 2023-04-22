package com.pattern.memento;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
