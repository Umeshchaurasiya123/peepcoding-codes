

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int row=n;
        int column=n;
        // write your code here
        //state of wakanda 2 program
        //here we have not to travel horizantly or diagnonaly 
        //we have to travel by dognaly 
        //so our outer loops represent digonals
        //here in 1sr diginal we have j-i=0 then j-i=1 then j-i=2 then j-i=3 and so one
        // how many digonal does we habe 
        //we have total pf no of diaginal is equal to total no of columns
        //consider gap=j-i;
        //gap==totoal number of columes

        for(int gap=0;gap<column;gap++)
        {
            //now time to traverse the digonals
            //note that our each diginam starty from zeroth row 
            for(int i=0,j=i+gap;j<column;i++,j++)
            {
                System.out.println(arr[i][j]);
            }


        }
    }


}
