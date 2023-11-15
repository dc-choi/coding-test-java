package com.example.javadatastructure.grammar.api.lang;

import java.util.Comparator;

public class Member implements Cloneable, Comparator<Member> {
    Long id;
    String name;

    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 이 메서드를 오버라이딩하는 경우 깊은 복사.
     * @return Member
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 새로운 객체를 생성하는 로직 생성.
        return super.clone();
    }

    /**
     * clone()를 오버라이딩 하지 않으면 얕은 복사
     * clone()를 오버라이딩 하면 깊은 복사
     * @return Member
     */
     public Member getMember() {
        Member cloned = null;

        try {
            cloned = (Member)clone();
        } catch (CloneNotSupportedException e) {
            System.out.println();
        }

        return cloned;
     }

    /**
     * 객체끼리 비교하기 위한 비교자
     *
     * @param a the first object to be compared.
     * @param b the second object to be compared.
     * @return
     */
    @Override
    public int compare(Member a, Member b) {
        if (a.id > b.id) return 1;
        else if (a.id == b.id) return 0;
        else return -1;
    }
}
