
1.Take as input String.

Write a function that removes all consecutive duplicates and then print desired
String.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
abc
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.

Sample Input 0

aabbbccccccc
Sample Output 0

abc

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String output="";
        
        char pvr='\0';
        for(int i=0;i<s.length();i++)
        {
         char cur=s.charAt(i);
            if(cur!=pvr)
            {
                output+=cur;
                
            }
            pvr=cur;
        }
        
      System.out.println(output);      
        
    }
}
