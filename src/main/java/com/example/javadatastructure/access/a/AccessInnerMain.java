package com.example.javadatastructure.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        accessData.publicVar = 10;
        accessData.protectedVar = 10;
        accessData.defaultVar = 10;
        System.out.println(accessData);
        // accessData.privateVar = 10; // 컴파일 오류 발생
    }
}
