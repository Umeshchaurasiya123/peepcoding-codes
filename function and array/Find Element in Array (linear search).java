

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

    // write your code here
    int n,d;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    d=sc.nextInt();
    
    int m =Linear_search(arr,d);
    System.out.println(m);
 }

 public static int Linear_search(int[] arr1,int n)
 {
     for(int i=0;i<arr1.length;i++)
     {
         if(arr1[i]==n)
         {
             return i;
         }


     }

    return -1;

 }

}
