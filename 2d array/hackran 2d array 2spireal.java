

1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Spiral print it clock wise and then anti-clock wise

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 9 8 7 4 5
1 4 7 8 9 6 3 2 5
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

1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
1 6 11 16 21 22 23 24 25 20 15 10 5 4 3 2 7 12 17 18 19 14 9 8 13
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
program 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static void first_function(int [][]arr,int r,int c)
    {
        
         int frow=0;
        int fcol=0;
        int lrow=r-1;
        int lcol=c-1;
        int counter=0;
        //for clocwisr
        while(counter!=r*c)
        {
            //loop for right
            for(int j=fcol;j<=lcol;j++)
            {
                System.out.print(arr[frow][j]+" ");
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            frow++;
            
            
            //loop for bottom
            for(int i=frow;i<=lrow;i++)
            {
               System.out.print(arr[i][lcol]+" "); 
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            lcol--;
            
            
            
            //loop for left
             for(int j=lcol;j>=fcol;j--)
            {
                System.out.print(arr[lrow][j]+" ");
                 counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            lrow--;
            
            
            //loop for top
            for(int i=lrow;i>=frow;i--)
            {
                System.out.print(arr[i][fcol]+" ");
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            fcol++ ; 
        }//while end heree 
           
        
    }
    
    public static void last_function(int [][]arr,int r, int c)
    { 
        int firstrow=0;
        int firstcol=0;
        int lastrow=r-1;
        int lastcol=c-1;
        int counter=0;
        
         while(counter!=r*c)
        {    
             //loop for bottom 
            for(int i=firstrow;i<=lastrow;i++)
            {
               System.out.print(arr[i][firstcol]+" "); 
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            firstcol++;
               
            //loop for right
            for(int j=firstcol;j<=lastcol;j++)
            {
                System.out.print(arr[lastrow][j]+" ");
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            lastrow--;
    
             
            //loop for top
            for(int i=lastrow;i>=firstrow;i--)
            {
                System.out.print(arr[i][lastcol]+" ");
                counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            lastcol-- ; 
            
            
            
            //loop for left
             for(int j=lastcol;j>=firstcol;j--)
            {
                System.out.print(arr[firstrow][j]+" ");
                 counter++;
                    if(counter==r*c)
                    {
                        break;
                    }
            }
            firstrow++;
            
             //after break it will break for loop not while so we havae to specify the condition for while loop also
        
        }//while loop end here

    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    
     first_function(arr,r,c);
       System.out.println();
       last_function(arr,r,c);    
        
    }
}
