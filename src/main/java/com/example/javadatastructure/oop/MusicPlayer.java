package com.example.javadatastructure.oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨을 올립니다. 현재 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨을 내립니다. 현재 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태");
        System.out.println("전원: " + (isOn ? "켜짐" : "꺼짐"));
        System.out.println("볼륨: " + volume);
    }
}
