package inheritance;

import java.util.ArrayList;

public class Review {

    public String body;
    public String author;
    public double stars;
    public String busines;
    public String movieSaw;

    public Review reviewConstructor(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;

        return this;
    }

    /**
     * theater review constructor is just an overloaded constructor that adds movie saw as a input field
     * and as a field in the review itself
     */
    public Review reviewConstructor(String body, String author, double stars, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movieSaw = movie;

        return this;
    }

    /**
     * the .toString method adds *'s to an array list for each iteration through a for loop, counting up to
     * the int of stars.
     */
    public String toString() {
        ArrayList<String> stringyStars = new ArrayList<>();

        for (int s = 0; s < stars; s++) {
            stringyStars.add("*");
        }

        String stringyReviewInfo = Business.name + " " + body + " " + author + " " + stringyStars;
        return stringyReviewInfo;
    }
}
