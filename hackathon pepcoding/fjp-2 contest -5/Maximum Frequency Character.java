

1.Take as input String.

Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.

Example(To be used only for expected output):

Input:
aabbbccccccc

output
c
Input Format

String representing S.

Constraints

Size of String may be large.

Output Format

print the output.

  
  //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //first we will make a frequeancy array
        
        int [] freq= new int [26];
        // in this array we store how many time each character apperse in string 
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        
        //to calculate maximum occuresns of any character 
        int maxf=0;
        char  maxchar='a';
        for(int i=0;i<26;i++)
        {
            if(freq[i]>maxf)
            {
                maxf=freq[i];
                maxchar=(char)('a'+i);
            }
            
        }
        
        System.out.print(maxchar);
    }
}
