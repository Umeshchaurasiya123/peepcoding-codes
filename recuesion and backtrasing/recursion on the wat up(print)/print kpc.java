
. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map
    0 -> .;
   1 -> abc
   2 -> def
   3 -> ghi
   4 -> jkl
   5 -> mno
   6 -> pqrs
   7 -> tu
   8 -> vwx
   9 -> yz
3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.     
                               
                               

Constraints

0 <= str.length <= 10 str contains numbers only

Format

Input

A string str

Output

Words that can be produced by pressed keys indictated by str in order hinted by Sample output

Example

Sample Input

78

Sample Output

tv
tw
tx
uv
uw
ux

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Main {

    public static String[] kpc={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        printKPC(0,str,""); //expectation that it will print all kpc
        
 }

    public static void printKPC(int idx,String str, String ans) {

        if(idx==str.length()){
            System.out.println(ans);
            return ; // to avoid -ve base case
        }

        String s=kpc[str.charAt(idx)-'0'];

        for(char ch:s.toCharArray()){

            printKPC(idx+1,str,ans+ch);
        }
    }

}
