

import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPalindrom(StringBuilder st){

        int left=0;
        int right=st.length()-1;
        while(left<right){

            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }

            left++;
            right--;

        }

    return true;

    }


	public static void solution(String str){
		//write your code here
        for(int i=0;i<str.length();i++){

            for(int j=i;j<str.length();j++){

                StringBuilder st=new StringBuilder(); // created empty mutable string 
                
                for(int k=i;k<=j;k++){
                //st+=str.charAt(k);
                st.append(str.charAt(k)); // .append methos convert string to string builder 

                }
                
               //  st.append(str.substring(i,j+1));

                if(isPalindrom(st)){
                    System.out.println(st);
                }

            }

        }
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}


