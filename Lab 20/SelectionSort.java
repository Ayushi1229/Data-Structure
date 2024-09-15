import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp =  arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
    }
    System.out.println("Your sorted array is:");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }   
}
}
