

1. Here are a few sets of inputs and outputs for your reference
Input1 -> 1
Output1 -> 1 1 1

Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2

Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

1 

Format

Input

A number n

Output

As discussed in point 1 of description

Example

Sample Input

3

Sample Output

3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
  
  
  
  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
  
  import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzz(n);
    }

    //expectation
    public static void pzz(int n){

        if(n==0) //base case
        return;
        // all print statement are faith with expectation
        System.out.print(n+" "); //preorder
        pzz(n-1); //faith
        System.out.print(n+" "); //inorder
        pzz(n-1);//faith
        System.out.print(n+" ");//postorder
        
    }


}


