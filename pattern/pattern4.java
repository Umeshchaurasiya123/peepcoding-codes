
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // write ur code here
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("\t");
            }
            
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*\t");
            }
            
            System.out.println();
        }

    }
}
