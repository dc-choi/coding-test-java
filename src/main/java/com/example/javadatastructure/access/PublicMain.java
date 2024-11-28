package com.example.javadatastructure.access;

import com.example.javadatastructure.access.a.PublicClass;

public class PublicMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass defaultClass = new DefaultClass();
    }
}

class DefaultClass {
}
