import java.util.Scanner;

public class QuickSort {
    static void quickSort(int[] arr,int lb,int ub){
        int n =arr.length;
        lb =0;
        ub =n-1;
        boolean flag = true;
        int i;
        int j=0;
        int key=0;
        if(lb<ub){
            i=lb;
            j=ub+1;
            key=arr[lb];
        
        while(flag==true){
            i=i+1;
            while(arr[i]<=key){
                i++;
            }
            j=j-1;
            while(arr[j]>key){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else{
                flag=false;
            }
        }
        int temp=arr[lb];
            arr[lb]=arr[j];
            arr[j]=temp;
            quickSort(arr, lb, j-1);
            quickSort(arr, j+1, ub);
    }
}
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a size of an array:");
                int size=sc.nextInt();
                int arr[]=new  int[size];
                System.out.print("enter en element:");
                for(int i=0;i<size;i++)
                {
                    arr[i]=sc.nextInt();
                }
            quickSort(arr,0,size-1);
            System.out.println("Sorted Array:");
            {
                for(int i=0;i<size;i++)
                System.out.println(arr[i]+",");
        }
}
}
