
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
  ///here addres of base is copy to a 
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
  //here addres of base is copy to a 
    // write your code here
    int left=0;
    int right=a.length-1;
    while(left<right)
    {
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
        left++;
        right--;
    }

  }
//whole code here
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
   // our variable a here is refrence variable which store the base addres of array which is created in heap
   //so here base addres of arrray is pass by value to both the function 
   //so all the change happend in array in heap is going to be permanet
   
    reverse(a);
    display(a);
 }

}
