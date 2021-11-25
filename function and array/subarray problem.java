

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
//creatinh the starying index
for(int start=0;start<n;start++)
{
//creating ending index
for(int end=start;end<n;end++)
{
    //creating a loop to print a element from starting enddex to ending index
    for(int i=start;i<=end;i++)
    {
        System.out.print(arr[i]+"\t");
    }
    System.out.println();
}
    //System.out.println();
}

    // write your code here
 }

}
