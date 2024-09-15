import java.util.Scanner;
public class InsertANumberInArrayAscendingOrder {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to be inserted:");
        int num = scanner.nextInt();
        int[] arr1 = new int[size+1];
        int j;
        for (j = 0; j < size; j++) {
            arr1[j] = arr[j];
            }
            arr1[j] = num;
            int temp;
            for (int i = 0; i < size; i++) {
                for (int k = i + 1; k < size+1; k++) {
                    if (arr1[i] > arr1[k]) {
                        temp = arr1[i];
                        arr1[i] = arr1[k];
                        arr1[k] = temp;
                        }
                    }
                }
                System.out.println("The array after inserting the number in ascending order is:");
                for (int i = 0; i < size+1; i++) {
                            System.out.print(arr1[i] + " ");
                            }
}
    
}