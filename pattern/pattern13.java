

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //pascal tringle
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            int ncr=1;
            for(int j=0;j<=i;j++)
            {
                
                System.out.print(ncr+"\t");
                
                    int ncrplusone=(ncr*(i-j))/(j+1);
                    ncr=ncrplusone;

               
            }
             System.out.println();
        }


    }
}
