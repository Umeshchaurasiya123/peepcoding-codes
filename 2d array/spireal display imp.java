

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][] arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int frow=0,fcolumn=0;
        int lrow=row-1;
        int lcolumn=column-1;
        int count=0;
        while(true)                 //we can also use while(counter!=row*column)  when we are using break instend of return , 
                                    //beacause break  movee control out of for loop  here 
                                    //so we havae to specify the reson for the while exit condtion 
        {
        //loop for top to bottom on row on left wall
    
        for(int i=frow;i<=lrow;i++)
        {
            System.out.println(arr[i][fcolumn]);
            count++;
            if(count==row*column)
            {
                return;
                //break;
            }
        }
        fcolumn++;

        //loop for left to right on  bottom wall on columns
        for(int j=fcolumn;j<=lcolumn;j++)
        {
            System.out.println(arr[lrow][j]);
            count++;
            if(count==row*column)
            {
                return;
            }
        }
        lrow--;

        //loop for bottom  to top on  right wall on rows
        for(int i=lrow;i>=frow;i--)
        {
            System.out.println(arr[i][lcolumn]);
            count++;
            if(count==row*column)
            {
                return;
            }
        }
        lcolumn--;

        //loop for right   to left on  tio wall on column
        for(int j=lcolumn;j>=fcolumn;j--)
        {
            System.out.println(arr[frow][j]);
            count++;
            if(count==row*column)
            {
                return;
            }
        }
        frow++;

        }


    }

}
