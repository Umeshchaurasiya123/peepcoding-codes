input 
3
1
2
3
4
5
6
7
8
9

output 
7 4 1 
8 5 2 
9 6 3 


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //time to transpose the array
        transpose(arr);
       // display(arr);
        //after transpose time to reverse the transpose matrix 
        reverse(arr);
        //it is time to print
        display(arr);


    }
    //we trnspose only upper trangle or lower trangle of matrix not both if w 
    //transpose whole matrix then resltant matrix is traspose of transpose that is same matrix
    public static void reverse(int [][] arr)
    {
       
        int row=arr.length;
        for(int i=0;i<row;i++)//here we get out first , 2nd , 3rd and so on rows
        {
             int left=0;
            int right=arr[0].length-1;
            while(left<right)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;

            }

        }

    }
    public static void transpose(int [][] arr)
    {
        int row=arr.length;
        int column=arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<column;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //transpose cpmpleted
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
