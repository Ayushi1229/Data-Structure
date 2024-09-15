import java.util.*;

public class QuickSort {
    static void quickSort(int[] arr){
        int n = arr.length;
        boolean flag = true;
        int lb = 0;
        int ub = n-1;
        int i=0;
        int j=0;
        int key;
        if(lb<ub){
            i = lb;
            j = ub+1;
            key = arr[lb];
            while(flag==true){
                i++;
                while(arr[i]<key){
                    i++;
                }
                j--;
                while(arr[j]>key){
                    j--;
                }
                if(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else{
                    flag = false;
                }
            }
            int tem = arr[lb];
            arr[lb] = arr[j];
            arr[j] = tem;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}