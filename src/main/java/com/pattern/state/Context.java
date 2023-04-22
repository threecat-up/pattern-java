package com.pattern.state;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
