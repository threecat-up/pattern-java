package com.pattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class Subject {
    private List<Observer> obvservers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        obvservers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : obvservers) {
            observer.update();
        }
    }
}
