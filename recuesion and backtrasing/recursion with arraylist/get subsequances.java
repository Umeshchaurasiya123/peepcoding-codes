
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= str.length <= 20

Format

Input

A string str

Output

Contents of the arraylist containing subsequences as shown in sample output

Example

Sample Input

abc

Sample Output

[, c, b, bc, a, ac, ab, abc]


------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

    Scanner sc=new Scanner(System.in);
    String str=sc.next();

    ArrayList<String> result=gss(0,str);//expectation that it will give us 
    // all the subsequance of string 
    System.out.println(result);


    }

    public static ArrayList<String> gss( int idx ,String str) {

        if(idx==str.length())
        {
            ArrayList<String> base=new ArrayList();//empty arraylist decletation and inicialization
            base.add("");
            return base;

        }

         
        ArrayList<String> smallans=gss(idx+1,str);// faith that it will return all sub sequance from 
                        //from ind+1 to last index
        ArrayList<String> ans= new ArrayList();

        for(String iterator:smallans)
        {
            ans.add(iterator); //meting expectation with faith

        }

        for(String iterator:smallans)
        {

            ans.add(str.charAt(idx)+iterator); // metting expectation with faith

        }


        return ans;



    }

}
