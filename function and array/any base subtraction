
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      if(n1>n2)
      {
          int temp=n1;
          n1=n2;
          n2=temp;
      }
      //n2 is biggest 
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int borrow=0;
       int result=0,multiplyer=1;
       int total=0;
       while(n1>0||n2>0)
       {
           int d1=n1%10;
           int d2=n2%10;
           n1=n1/10;
           n2=n2/10;
           int temp=d2-d1+borrow;
           if(temp<0)
           {
               result=(temp+b)*multiplyer;
               borrow=-1;

           }
           else{
               result=temp*multiplyer;
               borrow=0;
           }

           total=total+result;;
           multiplyer*=10;

           
       }
       return total;
       
   }
  
  }
