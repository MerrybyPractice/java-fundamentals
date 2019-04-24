package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant implements Business {
    //name, number of stars, price category

    public String name;
    public double stars;
    public double price;
    public ArrayList<Object> reviews;

    public Restaurant restaurantConstructor(String name, double stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();

        return this;
    }

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

    public void addReview(String body, String author, double stars) {
        Review reviewTitle = new Review().reviewConstructor(body, author, stars);

        double existingStars = this.stars;

        this.stars = ((existingStars / stars) * 100);

        reviews.add(reviewTitle);
    }

    public ArrayList viewReviews() {

        return reviews;
    }

}
