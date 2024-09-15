import java.util.Scanner;
public class MergeSort {
    public static void mergeSort(int[] arr , int low , int high) {
        if(low >= high){
            return;
        } 
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr , low , high , mid);
    }

    public static void merge(int arr[], int low, int high, int mid){
        int merged[] = new int[high-low+1];
        int h=low;
        int j=mid+1;
        int i=0;
        while(h<=mid && j<=high){
            if(arr[h]<=arr[j]){
                merged[i++]=arr[h++];
            }else{
                merged[i++]=arr[j++];
            }
        }
        while(h<=mid){
            merged[i++]=arr[h++];
        }
        while(j<=high){
            merged[i++]=arr[j++];
        }
        for(int k=0;k<merged.length;k++){
            arr[low+k]= merged[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array:");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The unsorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        mergeSort(arr, 0, n-1);

        System.out.println();
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        ;

        System.out.println();

        sc.close();
    }
}
