package com.example.javadatastructure.access;

public class SpeakerMain1 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        System.out.println("볼륨 필드에 직접 접근하여 수정");
        // speaker.volume = 200; 컴파일 오류 발생
        speaker.showVolume();
    }
}
