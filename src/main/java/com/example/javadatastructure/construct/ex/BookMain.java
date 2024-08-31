package com.example.javadatastructure.construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "John");
        Book book2 = new Book("Python", "Jane", 300);
        Book book3 = new Book("C++", "Tom", 400);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            book.displayInfo();
        }
    }
}
