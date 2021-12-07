
1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

1 

Format

Input

A number n

Output

n
n - 1
n - 2
.. 
1

Example

Sample Input

5

Sample Output

5
4
3
2
1

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
        
    }
    //expectation is this gunvtion will print number in decresing order
    public static void printDecreasing(int n){
        
        if(n==0) //base case
        //from here out function stop recusion 
        {
            return ;
        }
        //pre order case in which all the statement              exdicte     before faith statement or execte in a manner in which in way it push into function call stack 
        System.out.println(n); //meting faith with expectation
        
        printDecreasing(n-1); //our faith statement
        
        //post prder statemt will execute in a mananer           when function pop from function call stack;
        
        
        
    }

}
