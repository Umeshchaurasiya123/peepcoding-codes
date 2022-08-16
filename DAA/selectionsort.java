import java.util.Scanner;


public class ssort {

    public static boolean isSmaller(int [] arr, int i, int j){
        if(arr[j]<arr[i]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void swap(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void selectionsort(int []arr){

        for(int i=0;i<arr.length-1;i++){
            int minIdx=i;

            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,i,j)){
                    minIdx=j;
                }
            }

            swap(arr,i,minIdx);
        }

    }

    public static void print(int [] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        selectionsort(arr);

        print(arr);
        sc.close();

    }
}
