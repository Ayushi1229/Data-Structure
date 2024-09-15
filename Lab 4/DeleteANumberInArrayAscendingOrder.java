import java.util.Arrays;
import java.util.Scanner;
public class DeleteANumberInArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            }
            System.out.println("Enter the number to be deleted: ");
            int num = scanner.nextInt();
            int[] a1 = new int[n-1];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != num) {
                    a1[j] = a[i];
                    j++;
                    }
                    }
                    System.out.println("Array after deletion: ");
                    for (int i = 0; i < n-1; i++) {
                        System.out.print(a1[i] + " ");
                        }
                        // for (int i = 0; i < n; i++) {
                        //     for (int k = i + 1; k < n; k++) {
                        //         if (a1[i] > a1[k]) {
                        //             int temp = a1[i];
                        //             a1[i] = a1[k];
                        //             a1[k] = temp;
                        //             }
                        //         }
                        //     }
                // System.out.println("The array after merging two unsorted array:");
                //             System.out.print(Arrays.toString(a1) + " ");
        }
    }