
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      if(n1>n2)
      {
          int temp=n1;
          n1=n2;
          n2=temp;
      }
      int max=0;
      //n1 is slowest 
      for(int i=n1;i=>1;i--)
      {
          
          if(n1%i==0&&n2%i==0)
          {
              max=i;
              break;
          }
          
          //hcf=max
      }
      //lcm is here
      int lcm=(n1*n2)/max;
      //hcf
      System.out.println(max);
     //lcm
     System.out.println(lcm);
      
      
     }
    }
