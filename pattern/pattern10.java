
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();

    //upper part of pattern
    int counter=n/2;
    for(int i=1;i<=n/2+1;i++)
    {
       // type 1
        for(int j=counter;j>=1;j--)
        {
            System.out.print("\t");
        }
        counter--;
        //type 2
        System.out.print("*\t");
        //type3
        for(int j=1;j<=2*(i-1)-1;j++)
        {
            System.out.print("\t");
        }
        //type 4
        if(i!=1)
        {
            System.out.print("*\t");
        }

        System.out.println();
    }
     // write ur code here
    //lower part of codes
    int counter2=n/2;

    for(int i=1;i<=n/2;i++)
    {
        //type 1
        for(int j=1;j<=i;j++){
            System.out.print("\t");
        }
        //type 2
        System.out.print("*\t");
        //type 3
        for(int j=1;j<=2*counter2-3;j++)
        {
            System.out.print("\t");
        }
        counter2-=1;
        //type 4
        if(i!=n/2)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }


 }
}
