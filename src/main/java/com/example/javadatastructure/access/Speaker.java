package com.example.javadatastructure.access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume < 100) {
            volume += 10;
            System.out.println("볼륨을 10 올렸습니다. 현재 볼륨: " + volume);
        } else {
            System.out.println("볼륨을 더이상 높일 수 없습니다.");
        }
    }

    void volumeDown() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("볼륨을 10 내렸습니다. 현재 볼륨: " + volume);
        } else {
            System.out.println("볼륨을 더이상 낮출 수 없습니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 볼륨: " + volume);
    }
}
