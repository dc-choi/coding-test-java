package com.example.javadatastructure.class1;

import java.util.ArrayList;
import java.util.List;

public class ClassStart {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "Jane";
        student2.age = 21;
        student2.grade = 95;

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
