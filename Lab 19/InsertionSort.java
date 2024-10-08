import java.util.Scanner;
public class InsertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,1,10,5,2};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
