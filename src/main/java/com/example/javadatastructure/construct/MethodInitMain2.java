package com.example.javadatastructure.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "member1", 10, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "member2", 14, 85);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name: " + member.name);
            System.out.println("age: " + member.age);
            System.out.println("grade: " + member.grade);
            System.out.println();
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
