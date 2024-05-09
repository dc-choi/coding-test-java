package com.example.javadatastructure.grammar.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionTest {
    @Test
    void test() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
    }
}
