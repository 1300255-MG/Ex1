import java.util.Random;

public class Dice{
  public static void main(String[] args){  
    System.out.println("Rolling Dice...");
    Random r= new Random();
    int count=0;
    for(int i=1;i<=2;i++){
      int dice= r.nextInt(5)+1;
      System.out.println("Dice"+i+":"+dice);
      count = count+dice;
    }
    System.out.println("Total value:"+ count);
  }
