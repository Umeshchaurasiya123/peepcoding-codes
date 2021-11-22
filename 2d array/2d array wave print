//queestion

1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Wave print it row-wise and then column wise.

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 5 4 7 8 9
1 4 7 8 5 2 3 6 9
Input Format

Integer representing r and c.
Integer representing r*c numbers.
Constraints

N cannot be Negative.
0 <= r & c<= 10^9
-10^9 <= Arr[i] <= 10^9
Output Format

print the output.
Sample Input 0

5 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
Sample Output 0

1 2 3 4 5 10 9 8 7 6 11 12 13 14 15 20 19 18 17 16 21 22 23 24 25
1 6 11 16 21 22 17 12 7 2 3 8 13 18 23 24 19 14 9 4 5 10 15 20 25

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //wave traversal by row wise
        
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            else
            {
                for(int j=c-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }  
            }
        }
        System.out.println();
        
        
        //column by taversal of wave 
        
        for(int j=0;j<c;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<r;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            else
            {
                for(int i=r-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }  
            }
        }
        
        
    }
}





