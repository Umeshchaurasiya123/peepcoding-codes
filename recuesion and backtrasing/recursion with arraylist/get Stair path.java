

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= n <= 10

Format

Input

A number n

Output

Contents of the arraylist containing paths as shown in sample output

Example

Sample Input

3

Sample Output

[111, 12, 21, 3]



-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> al=getStairPaths(n);
        //expectation that it will give all the path from n to 0 by jumping 1, 2, 3 srep at a time

        System.out.println(al);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0) //+ base case here it will write [""] arraylist with empty string with size is oen
        //concatination of ""+1 is "1"
        // we get ["1"]
        {
            ArrayList<String> base=new ArrayList();
            base.add("");
            return base;
        }
        if(n<0) //-ve base case // here it will write [] empty arratlist 
        //and concatation of empty array list with 1 ,2 ,3 resut in empty also 
        // so it does not impect us
        {
            ArrayList<String> base=new ArrayList();
            return base;

        }


        //faith
        //it will give all the path from n-1 step to 0 step
        ArrayList<String> smallans1=getStairPaths(n-1);
        //it will give all the path from n-2 step to 0 steps
        ArrayList<String> smallans2=getStairPaths(n-2);
        // it will give us all the path from n-2 step to 0 step 
        ArrayList<String> smallans3=getStairPaths(n-3);

        //now one we get all the path from n-1 , n-2 ,n-3 step tp zzro step
        // now it is time to add in result;

        //mating faith with expectation
        //here we add all the array list which we get from n-1, n-2,n-3 calls
        ArrayList<String> anser=new ArrayList();

        for(String str:smallans1)
        {
            anser.add(1+str);
        }
        for( String str:smallans2)
        {
            anser.add(2+str);
        }

        for(String str:smallans3)
        {
            anser.add(3+str);
        }

       return anser;

    }

}
