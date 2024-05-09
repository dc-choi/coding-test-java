package com.example.javadatastructure.class1.ex;

public class ExMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "The Dark Knight";
        movieReview1.review = "This is a great movie!";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "Inception";
        movieReview2.review = "This is a great movie!";

        MovieReview movieReview3 = new MovieReview();
        movieReview3.title = "Interstellar";
        movieReview3.review = "This is a great movie!";

        System.out.println("Title: " + movieReview1.title + ", Review: " + movieReview1.review);
        System.out.println("Title: " + movieReview2.title + ", Review: " + movieReview2.review);
        System.out.println("Title: " + movieReview3.title + ", Review: " + movieReview3.review);
    }
}
