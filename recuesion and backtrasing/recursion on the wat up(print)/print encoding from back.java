

// print encoding from backside that is index start from last 


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int idx=str.length()-1;
        printCode(str,"",idx);
    }
    
    
    public static void printCode(String str,String psf,int idx){
        
          if(idx<-1){
            return ;
        }
        
        
        if(idx==-1){
            System.out.println(psf);
            return ;
        }
      
     //   System.out.println(idx);
        
        int num1=str.charAt(idx)-'0';
        if(num1>=1&&num1<=9){
            char ch=(char)(num1+'a'-1);
            printCode(str,ch+psf,idx-1);
        }
        
        if(idx>=0){
        int num2=str.charAt(idx-1)-'0';
         num2=num2*10;
        int num3=num2+num1;
        if(num3>=10&&num3<=26){
            char ch=(char)(num3+'a'-1);
            printCode(str,ch+psf,idx-2);
        }
            
        }
    }
    
}
