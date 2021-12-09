
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the elements of array from beginning to end each in a separate line.
4. For the above purpose complete the body of displayArr function. Don't change the signature.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.                 

Constraints

1 

Format

Input

A number n
n1
n2
.. n number of elements

Output

n1
n2
.. n elements

Example

Sample Input

5
3
1
0
7
5

Sample Output

3
1
0
7
5


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        displayArr(arr,0);
    }
//  expectation 
    public static void displayArr(int[] arr, int idx){

        if(idx==arr.length) //base case
        return ;

        System.out.println(arr[idx]); //meting expectation with faith

        displayArr(arr,idx+1); //faith
        // here our faith is function daiplay array from 1 to last incilally
        // 0 oth index will be print by us which is meting faith with expectation


    }

}