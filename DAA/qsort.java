import java.util.Scanner;

public class qsort {

    public static int partician(int [] arr, int pivot, int low, int high){

    int i=low, j=low;

    while(i<=high){
        if(arr[i]<=pivot){
            swap(arr,i,j);
            i++;
            j++;
        }
        else{
            i++;
        }
    }
    return (j-1);
    }

    public static void swap(int [] arr, int i, int j){
        int  temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


    public static void quicksort(int [] arr, int low, int high){

        if(low>high){
            return;
        }

        int pivot=arr[high];

        int pi=partician(arr,pivot,low,high);

        quicksort(arr, low, pi-1);

        quicksort(arr, pi+1, high);
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        quicksort(arr,0,arr.length-1);

        print(arr);


        sc.close();
    }
    
}
