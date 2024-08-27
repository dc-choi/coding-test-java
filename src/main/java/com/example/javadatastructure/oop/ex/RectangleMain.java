package com.example.javadatastructure.oop.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.getArea();
        System.out.println("사각형의 넓이: " + area);

        int perimeter = rectangle.getPerimeter();
        System.out.println("사각형의 둘레: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형인가요? => " + square);
    }
}
