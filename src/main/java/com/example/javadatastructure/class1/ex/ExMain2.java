package com.example.javadatastructure.class1.ex;

import java.util.ArrayList;
import java.util.List;

public class ExMain2 {
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

        List<MovieReview> movieReviews = new ArrayList<>();
        movieReviews.add(movieReview1);
        movieReviews.add(movieReview2);
        movieReviews.add(movieReview3);

        for (MovieReview mr : movieReviews) {
            System.out.println("Title: " + mr.title + ", Review: " + mr.review);
        }
    }
}
