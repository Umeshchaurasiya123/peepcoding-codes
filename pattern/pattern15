
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int count2=n/2;
        for(int i=1;i<=n/2+1;i++)
        {
            int count=(2*i-1)/2;
            for(int j=1;j<=count2;j++)
            {
                System.out.print("\t");
            }
            count2--;
             int temp=i;
            for(int j=1;j<=2*i-1;j++)
            {
                if(count>=0)
                {
                    System.out.print(temp+"\t");
                    if(count!=0)
                    {
                    temp++;
                    }
                    count--;
                }
                else
                {
                    temp--;
                    System.out.print(temp+"\t");
                }
            }
                System.out.println();
        }

      //for lower half of code
        int count3=1;    
        for(int i=n/2;i>=1;i--)
        {
            int count=(2*i-1)/2;
            //type 1
            
            for(int j=1;j<=count3;j++)
            {
                System.out.print("\t");
            }
            count3++;
            //type 2
             int temp=i;
            for(int j=1;j<=2*i-1;j++)
            {
                if(count>=0)
                {
                    System.out.print(temp+"\t");
                    if(count!=0)
                    {
                    temp++;
                    }
                    count--;
                }
                else
                {
                    temp--;
                    System.out.print(temp+"\t");
                }

            }

            System.out.println();
        }

    }
}
