import java.util.*;
  
  public class Main{
  
  public static void main(String[] args)
  {
      Scanner scn = new Scanner(System.in);
      int mark = scn.nextInt();
      if(mark>90)
      {
          System.out.println("excellent");
      }
      else if(mark>80&&mark<=90)
      {
         System.out.println("good");
      }
        else if(mark>70&&mark<=80)
      {
         System.out.println("fair");
      } 
      else if(mark>60&&mark<=70)
        {
         System.out.println("meets expectations");
      }
        else if(mark<=60)
      {
         System.out.println("below par");
      }
      
  
   }
  }
