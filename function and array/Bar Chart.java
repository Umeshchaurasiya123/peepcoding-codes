

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

int maxx=Integer.MIN_VALUE;

for(int i=0;i<n;i++)
{
maxx=Math.max(maxx,arr[i]);
}

int rows=maxx;
int column=n;
//as we have n number of column 
//and we have max(arr[i]) rows
for(int i=maxx-1;i>=0;i--)
{

    for(int j=0;j<n;j++)
    {
        if(i<arr[j])
        {
            System.out.print("*\t");
        }
        else{
            System.out.print("\t");
        }

    }
    System.out.println();
}

    // write your code here
 }

}
