package com.example.javadatastructure.construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("member1", 10, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("member2", 14, 85);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name: " + member.name);
            System.out.println("age: " + member.age);
            System.out.println("grade: " + member.grade);
            System.out.println();
        }
    }
}
