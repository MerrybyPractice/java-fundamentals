package inheritance;

import java.util.ArrayList;

public class Review {
    //body, author, number of stars
    public String body;
    public String author;
    public int stars;


    /**
     * the .toString method adds *'s to an array list for each iteration through a for loop, counting up to
     * the int of stars.
     */
    public String toString() {
        ArrayList<String> stringyStars = new ArrayList<>();

        for (int s = 0; s < stars; s++) {
            stringyStars.add("*");
        }

        String stringyReviewInfo = body + " " + author + " " + stringyStars;
        return stringyReviewInfo;
    }
}
