
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    //upper part of body
    int count=0;
    int count2=2*(n/2)-1;//n-2 also 
    for(int i=1;i<=n/2;i++)
    {
        //type 1
        for(int j=1;j<=count;j++)
        {
            System.out.print("\t");
        }
        count++;
        //type 2
        System.out.print("*\t");
        //type 3
        for(int j=1;j<=count2;j++)
        {
            if(i==1)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }
        }
        count2-=2;
        //type 4
         System.out.print("*\t");    
          System.out.println();

    }
    //lower half of codes
    int counter3=n/2;
    for(int i=1;i<=n/2+1;i++)
    {
        //type 1
        for(int j=1;j<=counter3;j++)
        {
             System.out.print("\t");
        }
        counter3--;
        //type 2
        for(int j=1;j<=2*i-1;j++)
        {
             System.out.print("*\t");

        }
         System.out.println();

    }


     // write ur code here

 }
}
