import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count=0;
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total duplicate elements in array:" + count);
    }
}
