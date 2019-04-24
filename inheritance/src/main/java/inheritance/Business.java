package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Business {

    String name = null;
    double stars = 0;
    double price = 0;
    ArrayList<Object> reviews = new ArrayList<>();

    String toString();

    void addReview(String reviewTitle, String body, String author, double stars);

    ArrayList viewReviews();


    //all businesses have name, description, stars, dollar signs
    //are able to be reviewed
    //can be reviewed using review body, stars, author, review title, connect to business
}
