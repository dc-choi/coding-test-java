package com.example.javadatastructure.oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        on(musicPlayerData);

        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);

        volumeDown(musicPlayerData);

        play(musicPlayerData);

        off(musicPlayerData);
    }

    private static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    private static void play(MusicPlayerData musicPlayerData) {
        if (musicPlayerData.isOn) {
            System.out.println("음악을 재생합니다.");
        }
    }

    private static void volumeUp(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println("음량을 1 증가시킵니다. 현재 음량: " + musicPlayerData.volume);
    }

    private static void volumeDown(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println("음량을 1 감소시킵니다. 현재 음량: " + musicPlayerData.volume);
    }

    private static void on(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
}
