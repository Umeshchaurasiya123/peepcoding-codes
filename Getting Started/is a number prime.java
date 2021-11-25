import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=1;i<=n;i++)
    {
        int m=scn.nextInt();
        int counter=0;
        for(int j=2;j*j<=m;j++)
        //or I can use j<=m/2 or j<=m-1
        {
           if(m%j==0)
           {
               counter++;
           }
            
        }
        if(counter==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
       // write ur code here
  
   }
  }
