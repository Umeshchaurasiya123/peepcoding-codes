

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //array decleraion and inicialization at same time
    //here array inicialise with default zero value
    int [] arr=new int[n];

    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();

    }

    /*
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");

    }
    */

     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     
     for(int i=0;i<n;i++)
     {
         if(arr[i]>max)
         {
             max=arr[i];
         }
          if(arr[i]<min)
         {
             min=arr[i];
         }


     }
     int span=max-min ;
     System.out.println(span);

     //System.out.println(min);
     //System.out.println(max);   


 }



}
