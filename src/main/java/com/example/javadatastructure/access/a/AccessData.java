package com.example.javadatastructure.access.a;

public class AccessData {
    public int publicVar;
    protected int protectedVar;
    int defaultVar;
    private int privateVar;

    @Override
    public String toString() {
        return "AccessData [publicVar=" + publicVar + ", protectedVar=" + protectedVar + ", defaultVar=" + defaultVar + ", privateVar=" + privateVar + "]";
    }
}
