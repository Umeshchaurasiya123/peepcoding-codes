//question

String With Difference Of Every Two Consecutive Characters

Easy

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1

Constraints

1 

Format

Input

A String

Output

A String

Example

Sample Input

pepCODinG

Sample Output

p-11e11p-45C12O-11D37i5n-39G







import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str)
    {
		// write your code here
        //first we make 2 pointers
        /*
        int privious=0;
        //inicialize an empty string 
        String res="";
        for(int future=1;future<str.length();future++)
        {
        
            res=res+str.charAt(privious);
            //int a = str.charAt(future);
            //int b=str.charAt(privious);
           // int diffrence=a-b;
            //System.out.println(diffrence);
             int diffrence=str.charAt(future)-str.charAt(privious);
            res+=diffrence;
            privious=future;
            }

            res=res+str.charAt(str.length()-1);
            return res
            }//function end here 
        
         */
            //creating empty mutable string name strb
            StringBuilder strb =new StringBuilder("");
            for(int i=0;i<str.length()-1;i++)
            {
                strb.append(str.charAt(i));
                strb.append(str.charAt(i+1)-str.charAt(i));
            

            }
            strb.append(str.charAt(str.length()-1));
            //.toString() convert stringBuildert  to string it
            //an process or boxing unboxing
            //most of time we does not neeed to specify it as
            //it will does by compiler automatically
            
            return strb.toString();
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
