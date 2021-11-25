

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int counter=n/2;
        for(int i=1;i<=n/2+1;i++)
        {
            //type 1 -
            for(int j=1;j<=counter;j++)
            {
                System.out.print("\t");
                
            }
            counter--;
            //type 2
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            
        }
        int counter2=1;
        for(int i=n/2;i>=1;i--)
        {
            
            for(int j=1;j<=counter2;j++)
            {
                System.out.print("\t");
            }
            counter2++;
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        
        // write ur code here

    }
}
