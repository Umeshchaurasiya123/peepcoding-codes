
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();

    }

    //total number of subset of aarray is 2^n;
    int total_sub_array=(int)Math.pow(2,n);
   // int power=(int)Math.pow(10,n-1);
    //System.out.println(power);
    //System.out.println(total_sub_array);
    for(int i=0;i<total_sub_array;i++)
    {
         int power=(int)Math.pow(10,n-1);
        int binary=decimaltobinary(i);
       // System.out.println(binary);
        //assume each digit is n number long
        //to get the first , 2nd , 3rd and so on digit first divide the binaty number by 
        //10^n-1 then take the % by 10 then reduce the power bt /10
       
        for(int j=0;j<n;j++)
        {
            int bit=(binary/power)%10;
           // bit=bit%10;
            power/=10;
            // System.out.print(bit);
            // System.out.print(power);
            
            if(bit==1)
            {
                System.out.print(arr[j]+"\t");
            }
            else
            {
                System.out.print("-\t");
            }
        }
    

        System.out.println();
        
    }

 }

 public static int decimaltobinary(int n)
 {
     int res=0;
     int mul=1;
     while(n!=0)
     {
         int rem=n%2;
         n=n/2;
         res=res+rem*mul;
         mul=mul*10;

     }
     return res;
 }


}

