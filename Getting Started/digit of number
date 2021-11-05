
//digit of number 
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int count=0;
      
      while(temp!=0)
      {
          temp=temp/10;
          count++;
      }
      
      int divisior=(int)Math.pow(10,count-1);
      while(divisior!=0)
      {
          int q=n/divisior;
          System.out.println(q);
          n=n%divisior;
          divisior=divisior/10;
      }
      
     }
    }
    //output id n=1234
    ten output is 
    1
    2
    3
    4
    
