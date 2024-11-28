package com.example.javadatastructure.access;

import com.example.javadatastructure.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        accessData.publicVar = 10;
        // accessData.protectedVar = 10; // 컴파일 오류 발생
        // accessData.defaultVar = 10; // 컴파일 오류 발생
        // accessData.privateVar = 10; // 컴파일 오류 발생
        System.out.println(accessData);
    }
}
