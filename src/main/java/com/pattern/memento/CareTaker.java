package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
