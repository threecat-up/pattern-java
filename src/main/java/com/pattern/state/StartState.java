package com.pattern.state;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
