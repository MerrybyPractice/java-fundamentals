package inheritance;

import java.util.ArrayList;

public class Theater implements Business {
    public String name;
    public double stars;
    public double price;
    ArrayList<Object> reviews = new ArrayList<>();
    ArrayList<String> movies = new ArrayList<>();

    public Theater theaterConstructor(String name, double stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();

        return this;
    }


    public void addReview(String body, String author, double stars, String movie) {
        Review reviewTitle = new Review().reviewConstructor(body, author, stars, movie);
        this.reviews.add(reviewTitle);

        double existingStars = this.stars;

        this.stars = ((existingStars / stars) * 100);


    }

    @Override
    public ArrayList viewReviews() {
        return reviews;
    }

    public void addMovie(String movie) {
        movies.add(movie);

    }

    public void removeMovie(String movie) {
        movies.remove(movie);

    }
}
