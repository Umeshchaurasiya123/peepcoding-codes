
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int counter=n/2+1;
        for(int i=1;i<=n/2+1;i++)
    {
        //    type 1
        for(int j=1;j<=counter;j++){
            System.out.print("*\t");
        }
       
        //type 2
        for(int j=1;j<=2*i-1;j++)
        {
            System.out.print("\t");
        }
        //type 3
        for(int j=1;j<=counter;j++)
        {
            System.out.print("*\t");
        }
         counter--;
         System.out.println();   
    }
    //lower half of code goes here
    int counter2=2;
    
    for(int i=n/2;i>=1;i--)
    {
       //type i
       for(int j=1;j<=counter2;j++)
       {
           System.out.print("*\t");
       }
       //type 2
        for(int j=1;j<=2*i-1;j++)
        {
            System.out.print("\t");
        }
        //type 3
        for(int j=1;j<=counter2;j++)
       {
           System.out.print("*\t");
       }
       counter2++;
        
        System.out.println();
    }

    }
}


