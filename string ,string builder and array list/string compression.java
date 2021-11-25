//question
/*
. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".

Constraints

1 

Format

Input

A String

Output

Two strings representing first compressed string and second compressed string respectively.

Example

Sample Input

wwwwaaadexxxxxx

Sample Output

wadex
w4a3dex6





*/




import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
       // write your code here
        //note double quotr tell us string and single quote 
        //tell us char
        //here a;so note that we can not compare empty character with any ohercataret
        //but we can compare null character with any character
        //error is given to us is empty character literal
        //it is called '\0' is call null which is might be defalut value of characcter data
        /*
        char pvr='\0';
        String output="";
        for(int i=0;i<str.length();i++)
        {
            char cur=str.charAt(i);
            if(pvr!=cur)
            {
                output=output+cur;
            }
            pvr=cur;
        }
        */
        
        
        //this method is also correct here note that if we 
        //exchage the position if i==0||str.charAt(i)!=str.charAt(i-1)
        // then it will give eror as i-1=0-1=-1 so out of bound errro 

        String output="";
        for(int i=0;i<str.length();i++)
        {
            if(i==0||str.charAt(i)!=str.charAt(i-1))
            {
                output=output+str.charAt(i);
            }

        }

        

		return output;
	}
    
	public static String compression2(String str){
		// write your code here
        
        int counter =1;
        char pvr='0';
        String output="";
        for(int i=0;i<str.length();i++)
        {
            char cur=str.charAt(i);
            if(pvr==cur)
            {
                counter++;
            }
            else if(pvr!=cur)
            {
                if(counter>1)
                {
                    //here i was making mistake as i was adding 
                    //output=output+cur+counter;
                    // it was giving me wrong result
                    //string + int + char result in string 
                    output=output+counter+cur;
                   // output=output+cur;
                    counter=1;

                }
                else{
                    output+=cur;
                }
            }
            if(i==str.length()-1)
            {
                if(counter>1)
                {
                output+=counter;
                }

            }

            pvr=cur;

            


        }



		return output;
	}
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
