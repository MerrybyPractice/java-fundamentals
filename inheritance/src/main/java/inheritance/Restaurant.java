package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    //name, number of stars, price category

    public String name;
    public int stars;
    public int price;
    public ArrayList<Object> reviews = new ArrayList<>();


    /**
     * the .toString method adds *'s and $'s to an array list for each iteration through a for loop, counting up to
     * the int of stars or price respectively
     */
    public String toString() {
        ArrayList<String> stringyStars = new ArrayList<>();

        for (int s = 0; s < stars; s++) {
            stringyStars.add("*");
        }

        ArrayList<String> stringyPrice = new ArrayList<>();

        for (int p = 0; p < price; p++) {
            stringyPrice.add("$");
        }

        String stringyRestaurantInfo = name + " " + stringyStars + " " + stringyPrice;
        return stringyRestaurantInfo;
    }

    public void addReview(String body, String author, int stars) {
        Review review = new Review();
        review.body = body;
        review.author = author;
        review.stars = stars;
        review.restaurant = this;

        int existingStars = this.stars;

        this.stars = existingStars / stars;

        reviews.add(review);
    }

    public ArrayList viewReviews() {
        return reviews;
    }

}
