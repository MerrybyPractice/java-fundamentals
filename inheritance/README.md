# Inheritance 

## Restaurant 

The Restaurant class has the following properties:
 
    1. String name
    2. int stars
    3. int price 
    4. ArrayList reviews 
The Restaurant class has the following methods: 

    1. toString - takes the name, stars, and price and returns stringyRestaurantInfo, which contains the String name, and
    an array list of the stars(*) and price($) as their respective symbols. 
    2. addReview - takes in the review classes body, author and stars and adds them to the reviews array list, associated with the 
    restraunt. Also resets the restraunts stars as an average of the exsisting star rating vs the review rating. 
    3. viewReviews - returns the reviews array list. 
    
## Review

The Review class has the following properties: 

    1. String body -- set by the user
    2. String author -- set by the user
    3. int stars -- set by the user
    4. Restaurant restaurant -- dected by the addReview method and set there
    
The Review class has the following method: 

    toString: returns the restraunt.name, body of the review, authors identifier, and an arraylist of the number of 
    star symbols (*) as a string. 