

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
        int multiplyer=1;
        int sum=0;
        while(n!=0)
        {
            int reminder=n%b;
            n=n/b;
            sum=sum+reminder*multiplyer;
            multiplyer*=10;
        }
        return sum;

   }
  }
