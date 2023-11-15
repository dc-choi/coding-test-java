package com.example.javadatastructure.grammar.generic;

public class Product<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <K, V> boolean compare(Product<K, V> p1, Product<K, V> p2) {
        boolean key = p1.getKey().equals(p2.getKey());
        boolean value = p1.getValue().equals(p2.getValue());
        return key && value;
    }
}
