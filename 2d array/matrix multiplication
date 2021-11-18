input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
output
10 0 10 0
0 20 20 40


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int row1=sc.nextInt();
    int column1=sc.nextInt();
    int [][] a1=new int[row1][column1];
    for(int i=0;i<row1;i++)
    {
        for(int j=0;j<column1;j++)
        {
            a1[i][j]=sc.nextInt();
        }

    }

    int row2=sc.nextInt();
    int column2=sc.nextInt();
    int [][] b1=new int[row2][column2];
    for(int i=0;i<row2;i++)
    {
        for(int j=0;j<column2;j++)
        {
            b1[i][j]=sc.nextInt();
        }

    }

    int [][] c1=new int[row1][column2]; 

    if(column1!=row2)
    {
        System.out.print("Invalid input");
        return;
    }
    else
    {
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<column2;j++)
            {
               //here both the outer loop repersent resentend matrix 
               for(int k=0;k<row2;k++)
               {
                   //here we use row 2 or column1 for termination condition 
                   //this for loop repersnrt multiplacation 
                   c1[i][j]+=a1[i][k]*b1[k][j];

               } 
            }
        }

    }//else end here

    int row3=c1.length;
    int column3=c1[0].length;
    for(int i=0;i<row3;i++ )
    {
        for(int j=0;j<column3;j++)
        {
            System.out.print(c1[i][j]+" ");
        }
        System.out.println();

    }

    
 }

}
