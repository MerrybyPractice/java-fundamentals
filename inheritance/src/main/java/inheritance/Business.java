package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Business {

    String name = null;
    double stars = 0;
    double price = 0;
    ArrayList<Object> reviews = new ArrayList<>();

    String toString();

    ArrayList viewReviews();

}
