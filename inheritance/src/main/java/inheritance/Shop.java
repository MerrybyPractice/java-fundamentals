package inheritance;

import java.util.ArrayList;

public class Shop implements Business {

    public String name;
    public double stars;
    public double price;
    public ArrayList<Object> reviews = new ArrayList<>();

    public Shop shopConstructor(String name, double stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();

        return this;
    }

    public String toString() {
        ArrayList<String> stringyStars = new ArrayList<>();

        for (int s = 0; s < stars; s++) {
            stringyStars.add("*");
        }

        ArrayList<String> stringyPrice = new ArrayList<>();

        for (int p = 0; p < price; p++) {
            stringyPrice.add("*");
        }

        String stringyShopInfo = name + " " + stringyStars + " " + stringyPrice;
        return stringyShopInfo;

    }

    @Override
    public void addReview(String body, String author, double stars) {
        Review reviewTitle = new Review().reviewConstructor(body, author, stars);

        double existingStars = this.stars;

        this.stars = ((existingStars / stars) * 100);
    }

    @Override
    public ArrayList viewReviews() {
        return reviews;
    }
}
