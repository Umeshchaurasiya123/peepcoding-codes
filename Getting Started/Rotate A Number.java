import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int temp=n,count=0;
     int sum=0;
     int i=0,total=0;
     while(temp!=0)
     {
         temp/=10;
         count++;
     }
      k=k%count;
     if(k>=0)
     {
    // k=k%count;
     while(i<k)
     {
     int rmd=n%10;
     n=n/10;
     sum=sum+rmd*(int)Math.pow(10,count-k+i);
     i++;
     }
     }
     else
     { // k=k%count;
    k=k+count;
     while(i<k)
     {
     int rmd=n%10;
     n=n/10;
     sum=sum+rmd*(int)Math.pow(10,count-k+i);
     i++;
     }
     }
     total=sum+n;
     System.out.println(total);
    }
   }
