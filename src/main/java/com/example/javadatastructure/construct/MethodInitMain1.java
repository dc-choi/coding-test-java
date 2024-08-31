package com.example.javadatastructure.construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "member1";
        member1.age = 10;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "member2";
        member2.age = 14;
        member2.grade = 85;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name: " + member.name);
            System.out.println("age: " + member.age);
            System.out.println("grade: " + member.grade);
            System.out.println();
        }
    }
}
