import java.util.Scanner;

public class isort {

    public static boolean isSmaller(int [] arr, int i, int j)
    {

        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }
    

    public static void insertion_sort(int[] arr){
    
    for(int i=1;i<arr.length;i++){
        for(int j=i;j>0;j--){
            if(isSmaller(arr,j,j-1))
            {
                swap(arr,j,j-1);
            }
            else{
                break;
            }
        }
    }

    } 

    public static void swap(int [] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
        System.err.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        insertion_sort(arr);

        print(arr);

        sc.close();


    }

    
}
