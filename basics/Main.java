public class Main{
  public static void main(String[] args){
    int catCount = 2; 
    System.out.println("I own" + " " + catCount + " " + pluralize("cat", catCount)+".");

    System.out.println(flipNHeads(4));
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
    public static String flipNHeads(int n){
      int i = 0;
      String side;
      int flips = 0;
      while (i < n){
        if(Math.random() >= 0.5){
          side = "Heads";
          i ++;
          flips ++;
        }else{
          i = 0;
          side = "Tails";
        }
        System.out.println(side);
      }
      return ("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
}

//flipping coins -- returns nothing to main, prints as goes
  //takes in integer n, flips until n heads are flipped in a row 
  //random number between o and 1
    //below .5 tails 
    //above .5 heads 
  //print out heads or tails accordingly on one line for each flip 
  //print "It took x flips to flip n heads in a row." after n has been achieved. 
//command line clock 
  //stretch goals: how fast in hertz? 