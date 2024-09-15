import java.util.Scanner;
public class MinMaxPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int small = a[0];
        int big = a[0];
        int sPos = 0;
        int bPos = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < small) {
                small = a[i];
                sPos = i;
            } else if (a[i] > big) {
                big = a[i];
                bPos = i;
            }
        }
        System.out.println("Smallest number: " + small + " at position " + sPos);
        System.out.println("Largest number: " + big + " at position " + bPos);
    }
}
