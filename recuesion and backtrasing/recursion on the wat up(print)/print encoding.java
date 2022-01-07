
1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= str.length <= 10

Format

Input

A string str

Output

Permutations of str in order hinted by Sample output

Example

Sample Input

655196


Sample Output

feeaif
feesf

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

public class Main {

    //String[] enc={'a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) throws Exception {
    
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    printEncodings(str,"",0);

    }

    public static void printEncodings(String input,String output,int idx) {

        if (idx==input.length())
        {
            System.out.println(output);
            return ;
        }

        int num1=input.charAt(idx)-'0';
        if(num1>=1&&num1<=9){
           String output1=output+(char)(num1+'a'-1);
            printEncodings(input,output1,idx+1);
        }

        if(idx+1<input.length()) // here we are cheching ki does any two digit no exist or not 
        // if we do not apply check here it will give me error of index out of bound
        {
            // both are same
        // int num2=((int)(input.charAt(idx))-'0')*10+(int)(input.charAt(idx+1))-'0';
        int num2=num1*10+(int)(input.charAt(idx+1))-'0';

        if(num2>=10 && num2<=26){
            String output2;
            // output =output+(char)(num2+'a'-1) give wrong  anser as we are making chage in original output so in case when 2nd function is called it will get modified output by dubction 1
            output2=output+(char)(num2+'a'-1);
            printEncodings(input,output2,idx+2);
        }

        }
    }

}


