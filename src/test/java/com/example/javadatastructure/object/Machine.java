package com.example.javadatastructure.object;

public interface Machine {
    // 선언은 인터페이스에서 하고 사용은 구현 객체를 통해서 사용한다.
    default void print() {
        /**
         * 디폴트 메서드가 생긴 이유
         * 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서다.
         * 기존 인터페이스의 이름과 추상 메서드의 변경 없이 디폴트 메서드만 추가할 수 있다.
         * 그렇기 때문에 이전에 개발한 구현 클래스를 그대로 사용할 수 있으면서 새롭게 개발하는 클래스는 디폴트 메서드를 활용할 수 있다.
         */
        System.out.println("이건 기계입니다.");
    }
}
