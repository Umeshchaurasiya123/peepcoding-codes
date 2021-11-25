1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

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

PEPcodINg




=================================================================================================================================================================================


import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        //next only takes single wrod
        //to take multiple word we shoud use .nextLine()
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //here instent of char we can declere ch as integer also
            // int ch=str.charAt(i);
            //here we does not need to  explesitly type cast as we are moving smaller countailer to longer countaner
            //because it done by compiler automaticlly
            //but stil if we want we can as (int)str.charAt(i)
            //but if we are moving from largert countainer to smller then it need to specify explicitly 

            
            if(ch>=97&&ch<=122) //here we also use (ch>='a'&&ch<='z')
            {
                ch-=32;
            
            }
            else
            {
                ch+=32;
            }


            System.out.print(ch);
            //System.out.print(char(ch))


        }

	}

}
