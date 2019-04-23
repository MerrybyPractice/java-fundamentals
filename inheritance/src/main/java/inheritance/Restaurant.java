package inheritance;

import java.util.ArrayList;

public class Restaurant {
    //name, number of stars, price category

    public String name;
    public int stars;
    public int price;

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

    //methods: toString

}
