
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int carry=0,multiplyer=1,result=0;
       while(n1>0||n2>0||carry>0)
       {
           int d1=n1%10;
           int d2=n2%10;
           int temp=d1+d2+carry;
           int q=temp/b;
           int reminder=temp%b;
           carry=q;
           result=result+reminder*multiplyer;
           multiplyer=multiplyer*10;
           n1=n1/10;
           n2=n2/10;



       }
       return result;
   }
  }
