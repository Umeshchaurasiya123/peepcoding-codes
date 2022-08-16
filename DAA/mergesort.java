import java.util.Scanner;

public class msort {

    public static int [] mergeTwoSortedArrays(int [] left, int [] right){

        int i=0,j=0,k=0;
        int [] ans=new int [left.length+right.length];

        while(i<left.length&&j<right.length){

            if(left[i]<=right[j]){
                ans[k]=left[i];
                i++;
                k++;

            }else{
                ans[k]=right[j];
                j++;
                k++;

            }

        }

        while(i<left.length){
            ans[k]=left[i];
            k++;
            i++;
        }

        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }
        

        return ans;


    }

    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }



    public static int [] mergeSort(int [] arr,int left, int right){

        if(left==right){
            int [] base=new int [1];
            base[0]=arr[left];
            return base;
        }

        int mid=(left+right)/2;

        int [] leftsorted=mergeSort(arr,left,mid);

        int [] rightsorted=mergeSort(arr, mid+1, right);

        int [] result=mergeTwoSortedArrays(leftsorted,rightsorted);

        return result;

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sa=mergeSort(arr,0,arr.length-1);
        // if array has 9 elelemt then it store it in 0 to 8

        System.out.println("Sorted array");

        print(sa);
        
        sc.close();
        

    }
    
}
