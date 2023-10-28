package com.example.javadatastructure.api.util;

public class User implements Comparable<User> {
    String name;

    public User(String name) {
        this.name = name;
    }

    /**
     * User 타입만 비교하기 위해 제네릭을 사용하였고,
     * compareTo() 메서드는 비교값을 리턴하도록 오버라이딩함.
     *
     * compareTo() 메서드의 반환값은 오름차순일 때 자신이 매개값보다 낮을 경우 음수,
     * 같은 경우 0, 높을 경우 양수를 반환하면 된다.
     *
     * 반대로 내림차순의 경우 자신이 매개값보다 낮을 경우 양수,
     * 같은 경우 0, 높을 경우 음수를 반환하면 된다.
     */
    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}
