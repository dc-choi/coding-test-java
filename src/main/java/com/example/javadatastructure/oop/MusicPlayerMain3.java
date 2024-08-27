package com.example.javadatastructure.oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();
    }
}
