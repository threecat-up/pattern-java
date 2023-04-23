package com.pattern.template;

/**
*
* @author threecat
* @date 2023/4/23
*/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
