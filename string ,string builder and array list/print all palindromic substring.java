
Print All Palindromic Substrings

Easy

1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Constraints

1 

Format

Input

A String

Output

All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Example

Sample Input

abcc

Sample Output

a
b
c
cc
c



import java.io.*;
import java.util.*;

public class Main {

    public static boolean ispalindrom(String sub)
    {
        int left=0;
        int right=sub.length()-1;
        while(left<right)
        {
            if(sub.charAt(left)!=sub.charAt(right))
            {
                return false;

            }

            left++;
            right--;

        }
        return true;

    }

	public static void solution(String str){

        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                //here substrint is a function wich take starting index and 
                //ending +1 index as parameter and return starint to ending string 
                //basicaaly it exclude last index
                //insted of substring we ca use 3rd loop such as 
                // String sub="";
                /*
                for(int k=i;k<=j;k++)
                {
                    sub+=str.charAt(k);

                }
                from this step we get our substring 
                */

                String sub=str.substring(i,j+1);
                if(ispalindrom(sub))
                {
                    System.out.println(sub);
                }
            }

        }
		//write your code here
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
