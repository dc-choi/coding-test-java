package com.example.javadatastructure.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("John", 20, 1);
        MemberConstruct member2 = new MemberConstruct("Jane", 21, 2);
        MemberConstruct member3 = new MemberConstruct("Tom", 22, 3);

        MemberConstruct[] members = {member1, member2, member3};

        for (MemberConstruct member : members) {
            System.out.println("name: " + member.name);
            System.out.println("age: " + member.age);
            System.out.println("grade: " + member.grade);
            System.out.println();
        }
    }
}
