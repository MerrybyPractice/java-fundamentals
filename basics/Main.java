import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
  public static void main(String[] args){
    int catCount = 2; 
    System.out.println("I own" + " " + catCount + " " + pluralize("cat", catCount)+".");

    System.out.println(flipNHeads(4));

    clock();
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
        flips ++;
      }
      System.out.println(side);
    }
    return ("It took " + flips + " flips to flip " + n + " heads in a row.");
  }
  
  public static void clock(){
    
    int pastSecond = 0; 
    
    while(true){

      LocalDateTime now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();
      
      
      String currentTime = hour+":"+minute+":"+second;
      if (now.getSecond() != pastSecond){
        System.out.println(currentTime);
        pastSecond = now.getSecond();
      }
    }
  
  
  }
} 


//command line clock 
  //stretch goals: how fast in hertz? 