
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        //upper half of code here
        int counter=0;
        int counter2=n-2;
        
        for(int i=1;i<=n/2+1;i++)
        {
            //type 1
            for(int j=1;j<=counter;j++)
            {
                System.out.print("\t");
            }
            //type 2
            System.out.print("*\t");
            //type 3
            for(int j=1;j<=counter2;j++)
            {
                System.out.print("\t");
            }
            counter2-=2;
            //type 4
            if(i!=n/2+1){
            System.out.print("*\t");
            }
            //type 5
            for(int j=1;j<=counter;j++)
            {
                System.out.print("\t");
            }
            counter++;

            System.out.println();
        }
        
        //lower half of code goes here
        
        int counter3=n/2-1;
        for(int i=1;i<=n/2;i++)
        {
         for(int j=1;j<=counter3;j++)
         {  
             //type 1
             System.out.print("\t");
         }
            //type 2
            System.out.print("*\t");
            //type 3
         for(int j=1;j<=2*i-1;j++)
            {
            System.out.print("\t");
         }
            //type 4
            System.out.print("*\t");
            //type 5
            for(int j=1;j<=counter3;j++)
             {  
             //type 5
             System.out.print("\t");
            }
            counter3--;
            System.out.println();


        }
    

        // write ur code here

    }
}
