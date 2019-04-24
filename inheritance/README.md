# Inheritance 

##Business Interface 
  The business interface works to standardize the three business classes: Restaurant, Theater, and Shop. 

### The Business Classes: Restaurants, Theaters, and Shops 

These classes all have the following properties:
 
    1. String name
    2. int stars
    3. int price 
    4. ArrayList reviews 

The Theater Class has the following additional properties: 
    
    1. ArrayList movies
    
These classes all have the following methods: 

    1. toString - takes the name, stars, and price and returns stringyRestaurantInfo, which contains the String name, and
    an array list of the stars(*) and price($) as their respective symbols. 
    2. addReview - takes in the review classes body, author and stars and adds them to the reviews array list, associated with the 
    restraunt. Also resets the restraunts stars as an average of the exsisting star rating vs the review rating. 
    3. viewReviews - returns the reviews array list. 
    
The Theater Class has the following additional properties: 

    1. addMovie - takes a String of the movie name and adds it to the Movies arrayList. 
    2. removeMovie - takes a String of the movie name and searches the Movies arrayList. If it is found, the String is removed.
    
    
## Review Class

The Review class has the following properties: 

    1. String body -- set by the user
    2. String author -- set by the user
    3. int stars -- set by the user
    4. Restaurant restaurant -- dected by the addReview method and set there
    5. String movieSaw -- set by the user, used in the Theater specific Review Constructor
    
The Review class has the following methods: 

    toString: returns the restraunt.name, body of the review, authors identifier, and an arraylist of the number of 
    star symbols (*) as a string. 
    
    reviewConstructor: the review constructor is an overloaded method that can take either of the following sets of parameters: 
        
        (String body, String author, double stars, String movie) - for use with the Theater class
        (String body, String author, double stars) - for use with all classes 
        
    The reviewConstructor encapsulates the properties necessary for each review so that they can be passed to the reviews 
    ArrayList associated with each business. 