package com.example.javadatastructure.construct;

public class DefaultMain1 {
    public static void main(String[] args) {
        memberDefault member1 = new memberDefault();
        memberDefault member2 = new memberDefault();
        memberDefault member3 = new memberDefault();

        memberDefault[] members = {member1, member2, member3};

        for (memberDefault member : members) {
            System.out.println("name: " + member.name);
            System.out.println("age: " + member.age);
            System.out.println("grade: " + member.grade);
            System.out.println();
        }
    }
}
