
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    int n=scn.nextInt();
    int counter=n/2;

    for(int i=1;i<=n/2+1;i++)
    {
        int counter2=2*i-1;
        for(int j=1;j<=counter;j++)
        {
            System.out.print("\t");
        }
        counter--;
        for(int j=1;j<=counter2;j++)
        {
            if(i>j)
            {
                if(i!=(n/2)+1)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }

            }
            else
            {
                System.out.print("*\t");
            }


        }
    
System.out.println();

    }

    //lowe half of code here
    int counter4=1;
    for(int i=n/2;i>=1;i--)
    {   
       // int counter3=2*i-1;
        for(int j=1;j<=counter4;j++)
        {
            System.out.print("\t");

        }
        counter4++;
        for(int j=1;j<=2*i-1;j++)
        {
            if(i>j)
            {
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }

        }
        System.out.println();
    }


    }
}
