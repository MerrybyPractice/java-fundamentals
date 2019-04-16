public class Main{
  public static void main(String[] args){
    int catCount = 2; 
    System.out.println("I own" + " " + catCount + " " + pluralize("cat", catCount)+".");

  }
    
    public static String pluralize(String animal, int quantAnimal){ 
      char s; 
      s = 's'; 
      String plural;
      
      if(quantAnimal == 0 || quantAnimal > 1 ){
        plural = animal+s;
      }else{
        plural = animal; 
      }
      
      return plural;
    }
}
  
//Pluralize -- needs to return a string
  //needs to accpect a word and a number
  //return a string with the word pluralized (ie, an s added on to the end) if hte number is 0 or greater than one
  //if number is one, do not add an s
//flipping coins -- returns nothing to main, prints as goes
  //takes in integer n, flips until n heads are flipped in a row 
  //random number between o and 1
    //below .5 tails 
    //above .5 heads 
  //print out heads or tails accordingly on one line for each flip 
  //print "It took x flips to flip n heads in a row." after n has been achieved. 
//command line clock 
  //stretch goals: how fast in hertz? 