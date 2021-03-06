problem

Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.

input:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
   
output:
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input Format

first line of input is row and column
second line contains row*column elements
Constraints

Integer Inout.
Output Format

display matrix
Sample Input 0

5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
Sample Output 0

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Solution {

 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][] arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column ;j++)
            {
                arr[i][j]=sc.nextInt();   
            }
        }
        //here i+j=0,1,2,3,4,5 6 
        //so total number of diagonal are equal to row-1+column-1 that is in question 5-1+4-1=7 ie o to 7  
        //total 8 diginals
        // out outer for loop going to run for total no of diginals
        //consider gap =i+j
        for(int gap=0;gap<=row-1+column-1;gap++)
        {
            //inver for loop to traverse the diginal 
        //here we divide our matrix in two part uppper part and lower trangular part
        //out upper part start from 0 th iagonal to <=(row-1+column-1)/2  
        //for upper part our column is counstant and row change 
            if(gap<=(row-1+column-1)/2)
            {
            for(int j=0,i=gap-j;i>=0;i--,j++)
                
            {
                System.out.print(arr[i][j]+" ");
            }
            }
            else
            {
             //for lower trangular part of last row is constant and columns is changing 
            //here our coundition is that our bour diginal traversing start form bottom wall and end in left wall so our ledt wall is termination condition 
               
                for(int i=row-1,j=gap-i;j<=column-1;i--,j++)
                {
                    System.out.print(arr[i][j]+" ");
                }  
            }
            System.out.println();
            
        }
        
    }
}
