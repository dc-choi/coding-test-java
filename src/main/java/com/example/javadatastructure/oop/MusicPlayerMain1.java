package com.example.javadatastructure.oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volume++;
        System.out.println("음량을 1 증가시킵니다. 현재 음량: " + volume);

        if (isOn) {
            System.out.println("음악을 재생합니다.");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
