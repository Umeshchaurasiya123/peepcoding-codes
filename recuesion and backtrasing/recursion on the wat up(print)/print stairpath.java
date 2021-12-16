

. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= n <= 10

Format

Input

A number n

Output

Print paths (one path in each line) in order hinted by Sample output

Example

Sample Input

3

Sample Output

111
12
21
3
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printStairPaths(n,""); // faith that it will 
        //give all the path from 0 to n or n to 0

    }

    public static void printStairPaths(int n, String path) {

        if(n==0) //+ve base case
        {
            System.out.println(path);
            return;
        }
         if(n<0) //-ve base case
        {
            return;
        }

        printStairPaths(n-1,path+1); //faith it it will printall the path from n-1 to 0
        printStairPaths(n-2,path+2);  //faith it it will printall the path from n-2 to 0 
        printStairPaths(n-3,path+3); ////faith it it will printall the path from n-3 to 0


    }

}
