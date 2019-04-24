package inheritance;

import java.util.ArrayList;

public class Review {

    public String body;
    public String author;
    public double stars;
    public Restaurant restaurant;

    public Review reviewConstructor(Review reviewTitle, String body, String author, double stars) {
        reviewTitle = new Review();
        reviewTitle.body = body;
        reviewTitle.author = author;
        reviewTitle.stars = stars;
        reviewTitle.restaurant = this.restaurant;

        return reviewTitle;
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

        String stringyReviewInfo = restaurant.name + " " + body + " " + author + " " + stringyStars;
        return stringyReviewInfo;
    }
}
