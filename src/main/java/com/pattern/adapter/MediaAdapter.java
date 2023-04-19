package com.pattern.adapter;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc("vlc");
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4("mp4");
        }
    }
}
