package com.pattern.adapter;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
